package com.bridgelabz;

public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int RATE_PER_HOUR = 20;
    static final int TOTAL_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("**** Employee Wage Computation Program ****\n\n");

        int empHours = 0;
        int empWage = 0;
        int totalWage = 0;

        for(int i = 1; i <= TOTAL_WORKING_DAYS; i++){

            int checkAttendance = (int) Math.floor(Math.random() * 10) % 3;

            switch (checkAttendance){
                case IS_PART_TIME:
                    empHours = 5;
                    break;

                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                default:
                    empHours = 0;
            }
            empWage = empHours * RATE_PER_HOUR;
            System.out.println("Employee Wage for Day " + i + " = " + empWage);
            totalWage = totalWage + empWage;
        }
        System.out.println("\nEmployee Monthly Wage = " +totalWage);
    }
}

