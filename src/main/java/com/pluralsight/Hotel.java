package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private boolean bookedSuites;
    private boolean bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, boolean bookedSuites, boolean bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        if (suite) {
            if (roomCount > this.numberOfSuites) {
                System.out.printf("Only %d are available...%n", this.numberOfSuites);
                return false;
            } else {
                this.numberOfSuites -= roomCount;
                return true;
            }
        } else {
            if (roomCount > this.numberOfRooms) {
                System.out.printf("Only %d are available...%n", this.numberOfRooms);
                return false;
            } else {
                this.numberOfRooms -= roomCount;
                return true;
            }
        }
    }
}
