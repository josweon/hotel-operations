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
    private boolean isPunchedIn;

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
        double regularPay = this.getHoursWorked() * this.getPayRate();
        double overtimePay = this.getHoursWorked() * (this.getPayRate() * 1.5);

        return regularPay + overtimePay;
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

        int startTotalMinutes = this.startTime * 60 + this.startMinutes;
        int endTotalMinutes = this.endTime * 60 + this.endMinutes;
        double hours = (endTotalMinutes - startTotalMinutes) / 60;

        this.hoursWorked += hours;

    }

    public void punchTimeCard(int time) {
        if (isPunchedIn) {
            this.endTime = time;
            int totalTime = this.endTime - this.startTime;
            hoursWorked += totalTime;
            this.isPunchedIn = false;

        } else {
            this.startTime = time;
            this.isPunchedIn = true;
        }
    }
}