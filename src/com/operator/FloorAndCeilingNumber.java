package com.operator;

import java.util.Scanner;

public class FloorAndCeilingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		double num = scan.nextDouble();
		System.out.println((int)Math.ceil(num));
		System.out.println((int)Math.floor(num));
		}
}
