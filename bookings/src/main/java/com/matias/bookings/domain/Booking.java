package com.matias.bookings.domain;

import java.time.LocalDateTime;
import java.util.Set;

public class Booking {

    private Integer id;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Organizer organizer;
    private Set<Member> members;
    private String description;
    private String title;
    private Room room;

    public Booking(Integer id, LocalDateTime fromDate, LocalDateTime toDate, Organizer organizer, Set<Member> members, String description, String title, Room room) {
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.organizer = organizer;
        this.members = members;
        this.description = description;
        this.title = title;
        this.room = room;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
