package com.matias.bookings.repository;

import com.matias.bookings.domain.Booking;
import com.matias.bookings.domain.Organizer;
import com.matias.bookings.domain.Member;
import com.matias.bookings.domain.Room;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class BookingRepository implements IRepository<Booking, Integer> {

    public List<Booking> findAll() {
        return null;
    }

    public void save(Booking booking) {

    }

    public void update(Booking entity) {

    }

    public Booking findById(Integer id){
        List<Booking> bookings = getMockBookings();

        return bookings.stream()
                .filter(bk -> bk.getId().equals(id)).findAny().orElse(null);
    }

    public List<Booking> findByRoomIdBetweenFromDateAndToDate(Integer roomId, LocalDateTime fromDate, LocalDateTime toDate) {
        List<Booking> bookings = getMockBookings();

        return bookings.stream()
                .filter(bk -> (bk.getRoom().getId().equals(roomId)
                        && ( fromDate.isAfter(bk.getFromDate()) && toDate.isBefore(bk.getToDate()) )
                )).collect(Collectors.toList());
    }


    /**
     * Mocking purposes
     */
    private List<Booking> getMockBookings(){
        Organizer organizer_1 = new Organizer(1, "John", "Frusciante", "jf@gmail.com", "Developer");
        Organizer organizer_2 = new Organizer(2, "Chris", "Cornell", "cc@gmail.com", "QA");
        Set<Member> members = new HashSet<>();
        Room room_1 = new Room(1, "Green Room", 12);
        Room room_2 = new Room(2, "Blue Room", 3);
        Room room_3 = new Room(3, "Red Room", 20);

        Booking booking_1 = new Booking(1,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                organizer_1,
                members,
                "Planning meeting",
                "Planning",
                room_1);

        Booking booking_2 = new Booking(2,
                LocalDateTime.now().plusDays(1),
                LocalDateTime.now().plusDays(1).plusHours(1),
                organizer_2,
                members,
                "Retrospective meeting",
                "Retrospective",
                room_2);

        Booking booking_3 = new Booking(3,
                LocalDateTime.now().plusDays(1),
                LocalDateTime.now().plusDays(1).plusHours(3),
                organizer_1,
                members,
                "Daily meeting",
                "Daily",
                room_3);

        Booking booking_4 = new Booking(4,
                LocalDateTime.now().plusDays(1).plusHours(3),
                LocalDateTime.now().plusDays(1).plusHours(4),
                organizer_2,
                members,
                "Planning meeting",
                "Planning",
                room_1);

        List<Booking> bookings = new ArrayList<>();

        bookings.add(booking_1);
        bookings.add(booking_2);
        bookings.add(booking_3);
        bookings.add(booking_4);

        return bookings;
    }
}
