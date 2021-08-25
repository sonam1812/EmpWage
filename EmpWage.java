package com.EmpWage;

public class EmpWage {
	
public static void main(String[] args) {
	
	
        int WagePerHour = 20;
        int fullDayHour = 8;
        int DailyWage;
        int i;
        int NumberOfWorkingDays = 20;
        int store = 0;
        for (i=1; i<= NumberOfWorkingDays; i++)
        {
            double attendance = Math.floor(Math.random() * 2);
            store += attendance;
        }
        System.out.println("Number of days the employee was present : "+store);
        DailyWage = fullDayHour * WagePerHour * store;
        System.out.println("Total Wage of Employee : "+DailyWage);
    }
}