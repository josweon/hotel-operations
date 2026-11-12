package com.pluralsight;

public class Main {

    public static void main(String[] args) {
//
        Room testRoom = new Room(5,9.99,true, false);
        System.out.println(testRoom.isAvailable());

        Reservation testRes = new Reservation("KING", 5, false);

        System.out.println(testRes.getReservationTotal());

        Employee testEmployee = new Employee(12345, "Jensen", "Hardware", 120, 0);
        System.out.println(testEmployee.getRegularHours());
        System.out.println(testEmployee.getOvertimeHours());
//        testEmployee.punchIn(8);
//        testEmployee.punchOut(17);
//        System.out.println(testEmployee.getHoursWorked());
        System.out.println(testEmployee.getHoursWorked());

//        //test punchIn / punchOut

        //test punchTimeCard();
        System.out.println("timecard");
        testEmployee.punchIn(0);
        testEmployee.punchTimeCard(8);
        System.out.println(testEmployee.getHoursWorked());
        testEmployee.punchTimeCard(12);
        System.out.println(testEmployee.getHoursWorked());


    }
}
