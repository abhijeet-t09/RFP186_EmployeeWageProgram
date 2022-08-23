package com.bridgelabz;

public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("**** Employee Wage Computation Program ****\n\n");

        int empHours = 0;
        int empWage = 0;

        int checkAttendance = (int) Math.floor(Math.random() * 10) % 3;

        if (checkAttendance == IS_PART_TIME) {
            System.out.println("Employee Works Part-time");
            empHours = 5;
        }
        else if (checkAttendance == IS_FULL_TIME) {
            System.out.println("Employee Works Full-time");
            empHours = 8;
        }
        else {
            System.out.println("Employee is Absent!!");
            empHours = 0;
        }

        empWage = empHours * RATE_PER_HOUR;
        System.out.println("Employee Wage = " + empWage);
    }
}

