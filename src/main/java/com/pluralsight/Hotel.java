package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        if (suite) {
            int available = getAvailableSuites();
            if (roomCount > available) {
                System.out.printf("Only %d are available...%n", available);
                return false;
            } else {
                this.bookedSuites += roomCount;
                return true;
            }
        } else {
            int available = getAvailableRooms();
            if (roomCount > available) {
                System.out.printf("Only %d are available...%n", available);
                return false;
            } else {
                this.bookedBasicRooms += roomCount;
                return true;
            }
        }
    }

    public int getAvailableSuites() {
        int availableSuites = this.numberOfSuites - this.bookedSuites;
        return availableSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

}
