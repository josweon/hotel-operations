package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Room testRoom = new Room(5,9.99,true, false);
        System.out.println(testRoom.isAvailable());

        Reservation testRes = new Reservation("KING", 5, false);

        System.out.println(testRes.getReservationTotal());

    }
}
