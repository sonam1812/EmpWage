package com.EmpWage;

public class EmpWage {
	
public static void main(String[] args) {
	
	
	 int WagePerHour = 20;
     int fullDayHour = 8;
     int DailyWage;
     int i;
     int NumberOfWorkingDays = 30;
     int store = 0;
     for (i=1; i<= NumberOfWorkingDays; i++)
     {
         double attendance = Math.floor(Math.random() * 2);
         store += attendance;
     }
     int totalWorkingHour = 8 * store;
     if (totalWorkingHour >= 100)
     {
         DailyWage = WagePerHour * totalWorkingHour;
         System.out.println("Employee's Wage is " +DailyWage +" Employee's Total Working Hour is " +totalWorkingHour);
     }
     else System.out.println("Employee's total working hour is less than 100.");
 }
}