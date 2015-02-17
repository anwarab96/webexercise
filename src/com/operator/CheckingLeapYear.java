package com.operator;

public class CheckingLeapYear {

	public static void main(String[] args) {
		//Year we want to check
		int year= 1556;
		//if year is divisible 4,it is a leap year
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		System.out.println("The Year " + year + " is a leap year ");
		
		else
		System.out.println("The Year " + year + "is not a leap year");
	}

}
