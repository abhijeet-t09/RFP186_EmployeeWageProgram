package com.bridgelabz;

public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
//    static final int RATE_PER_HOUR = 20;
//    static final int MAX_WORKING_DAYS = 20;
//    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("**** Employee Wage Computation Program ****\n\n");
        calculateEmpWage("Zydus Cadila", 25, 108, 24);
        calculateEmpWage("Pfizer", 30, 120, 24);
        calculateEmpWage("Sun Pharma", 28, 108, 26);
    }

    static void calculateEmpWage(String companyName, int ratePerHour, int maxWorkingHours, int maxWorkingDays){

        int empHours = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        System.out.println("\t**" + companyName + "**");

        while(totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays){

            totalWorkingDays++;

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
            totalWorkingHours = totalWorkingHours + empHours;
            System.out.println("Days Worked = " + totalWorkingDays + " || Hours Worked = " + totalWorkingHours);

        }
        totalWage = totalWorkingHours * ratePerHour;
        System.out.println("\nEmployee Monthly Wage = " + totalWage + "\n");
    }
}
