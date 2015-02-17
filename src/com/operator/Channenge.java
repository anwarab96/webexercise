package com.operator;

import java.util.Scanner;

public class Channenge {

	public static void main(String[] args) {
		changinFahrenheitToCelsius();
		changingCelsiusToFahrenheit();
	}

	private static void changinFahrenheitToCelsius() {
		System.out.println("Enter a temperature in Fahrenheit: ");
	Scanner scan = new Scanner(System.in);
	double temperature = 0;
	temperature = scan.nextDouble();
	temperature = ((temperature - 32)*5)/9;
	System.out.println("Temperature in Celsius = "+ temperature);
	}
	private static void changingCelsiusToFahrenheit()
	{
	System.out.println("Enter a temperature in Celsius: ");
	Scanner scan = new Scanner(System.in);
	double temperature = 0;
	temperature = scan.nextDouble();
	temperature = ((temperature*9/5)+32);
	System.out.println("Temperature in Farenheit = "+ temperature);
	}

}
