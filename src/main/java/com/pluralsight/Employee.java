package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;
    private int endTime;
    private int startMinutes;
    private int endMinutes;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return this.getRegularHours() + this.getOvertimeHours();
    }

    public double getRegularHours() {
        double hours = (this.hoursWorked > 40) ? 40 : this.hoursWorked;
        return hours;
    }

    public double getOvertimeHours() {
        double overtime = (this.hoursWorked > 40) ? this.hoursWorked - 40 : 0;
        return overtime;
    }

    public void punchIn(int time) {
        this.startTime = time;
    }

    public void punchOut(int time) {
        this.endTime = time;
        this.hoursWorked += (this.endTime - this.startTime);
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        this.startTime = now.getHour();
        this.startMinutes = now.getMinute();
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        this.endTime = now.getHour();
        this.endMinutes = now.getMinute();
    }

    public void punchTimeCard(int time) {
        if (this.startTime > 0){
            this.endTime = time;
            hoursWorked += (this.endTime - this.startTime);
        } else {
            this.startTime = time;
        }
    }
}
