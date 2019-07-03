package com.matias.bookings.service;

import com.matias.bookings.domain.Booking;
import com.matias.bookings.domain.Room;
import com.matias.bookings.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {

    private static final int MIN_MINUTES_DURATION = 15;
    private static final int MAX_MINUTES_DURATION = 180;

    @Autowired
    BookingRepository bookingRepository;

    /**
     * Provides all the bookings
     * @return List<Bookings>
     **/
    public List<Booking> getBookings(){
        return bookingRepository.findAll();
    }

    /**
     * @param booking
     * Persist Booking.
     **/
    public void save(Booking booking) throws Exception {

        validateBooking(booking);
        bookingRepository.save(booking);
    }

    /**
     * @param booking
     * Update Booking.
     **/
    public void update(Booking booking) throws Exception {

        validateBooking(booking);
        validateOrganizer(booking);
        bookingRepository.update(booking);
    }

    /**
     * @param booking
     * Validate Booking.
     * **/
    private void validateBooking(Booking booking) throws Exception {

        if(!timeIsValid(booking.getFromDate(), booking.getToDate())){
            throw new Exception("Booking should last more than 15 minutes and less than 3 hours");
        }

        if(!IsNotOverlapping(booking.getRoom(), booking.getFromDate(), booking.getToDate())){
            throw new Exception("Booking cannot overlap another booking");
        }

    }

    /**
     * @param fromDate
     * @param toDate
     * Validate cannot last last less than 15 minutes and no longer than 3 hours.
     * @return Boolean true if time duration is valid, false if not
     * **/
    private Boolean timeIsValid(LocalDateTime fromDate, LocalDateTime toDate){

        Duration duration = Duration.between(fromDate, toDate);

        if(duration.toMinutes() < MIN_MINUTES_DURATION){
            return false;
        }

        if(duration.toMinutes() > MAX_MINUTES_DURATION){
            return false;
        }

        return true;
    }

    /**
     * @param room
     * @param fromDate
     * @param toDate
     * @return Boolean true if room is available, false if not.
     * Validate cannot overlap another booking for the room.
     * **/
    private Boolean IsNotOverlapping(Room room, LocalDateTime fromDate, LocalDateTime toDate){

        Boolean roomIsAvailable = roomIsAvailable(room.getId(), fromDate, toDate);

        if(roomIsAvailable){
            return true;
        }

        return false;
    }

    /**
     * @param roomId room Id
     * @param fromDate date from for booking
     * @param toDate date to for booking
     * @return Boolean true if room is available
     */
    private Boolean roomIsAvailable(Integer roomId, LocalDateTime fromDate, LocalDateTime toDate){
        List<Booking> bookings = bookingRepository.findByRoomIdBetweenFromDateAndToDate(roomId, fromDate, toDate);

        if(bookings != null){
            return false;
        }

        return true;
    }

    /**
     * @param booking
     * Validate only the organizer can modify it.
     * **/
    private void validateOrganizer(Booking booking) throws Exception {

        Booking originalBooking = bookingRepository.findById(booking.getId());

        if(!originalBooking.getOrganizer().getId().equals(booking.getOrganizer().getId())){
            throw new Exception("Unauthorized: Only organizer can modify this booking");
        }
    }

}
