package com.EmpWage;

public class EmpWage {
	
public static void main(String[] args) {
	
        double attendance = Math.floor(Math.random() * 3);
        int WagePerHour = 20;
        int fullDayHour = 8;
        int DailyWage;
        if (attendance == 1) {
            System.out.println("Employee is Present");
            DailyWage = WagePerHour * fullDayHour;
            System.out.println(DailyWage);
        }
        else if (attendance == 2)
        {
            int partTimeHour = 8;
            System.out.println("Employee is part-time employee");
            DailyWage = WagePerHour * partTimeHour;
            System.out.println("Employee's Daily Wage is : " +DailyWage);
        }
        else System.out.println("Employee is Absent");
    }
}
	

