package com.bridgelabz;

public class EmployeeWage {

    static final int IS_PRESENT = 1;
    static final int RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("**** Employee Wage Computation Program ****\n\n");

        int empHours = 0;
        int empWage = 0;

        int checkAttendance = (int)Math.floor(Math.random() * 10) % 2;

        if(checkAttendance == IS_PRESENT) {
            System.out.println("Employee is Present!!");
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
