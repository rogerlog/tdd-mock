package com.example.tdd.model;

import java.time.LocalDate;

public class BoockingModel {

    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkout;
    private int numberGuests;

    public BoockingModel(String id, String reserveName, LocalDate checkIn, LocalDate checkout, int numberGuests) {
        this.id = id;
        this.reserveName = reserveName;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.numberGuests = numberGuests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }
}
