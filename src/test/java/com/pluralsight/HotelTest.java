package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void bookRoom() {
        // arrange
        Hotel testHotel = new Hotel("Patel's Palace", 5,5);
        // act
        boolean actual = testHotel.bookRoom(4, false);
        boolean expected = true;
        // assert
        assertEquals(expected, actual);
    }

}