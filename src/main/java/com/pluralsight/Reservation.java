package com.pluralsight;

import java.util.Locale;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.toLowerCase();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        switch (roomType.toLowerCase()) {
            case "king" -> this.roomType = roomType.toLowerCase();
            case "double" -> this.roomType = roomType.toLowerCase();
            default -> {
                System.out.println("not a room type");
                this.roomType = "";
            }
        }
    }

    public double getPrice() {
        double price = 0;
        if (this.roomType.equals("king")) {
            price = 139;
            return price;
        } else if (this.roomType.equals("double")) {
            price = 124;
            return price;
        }
        return price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    public void setWeekend(boolean weekend){
        this.isWeekend = weekend;
    }

    public double getReservationTotal () {
        double pricePerNight = this.getPrice();
        double total = 0;

        if (isWeekend) {
            int nights = this.numberOfNights;
            if (nights <= 2) {
                total = (pricePerNight + (pricePerNight * 0.1)) * nights;
            } else {
                int weekdays = nights - 2;
                total = ((pricePerNight + (pricePerNight * 0.1)) * 2) + (pricePerNight * weekdays);
            }
        } else {
            total = pricePerNight * this.getNumberOfNights();
        }

        return total;
    }
}
