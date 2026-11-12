package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isDirty;
    private boolean isOccupied;

    public Room(int numberOfBeds, double price, boolean isDirty, boolean isOccupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public boolean isDirty () {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public void checkIn() {
        if (isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true;
        }
    }

    public void cleanRoom() {
        this.isDirty = false;
    }

    public void checkOut() {
        this.cleanRoom();
        this.isOccupied = false;
    }
}
