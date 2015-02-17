package com.controlflow;

import java.util.Scanner;

public class Challenge3 {
	//Given 12 + 12, ask the user for the user inputs the correct answer, print true else print false.
	//Use boolean and not String.
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("What is correct answer for 12 + 12 =  is: ");
		int input = scan.nextInt();
		boolean answer = false;
		if(input==24)
		{
			 
			    answer = true;
			System.out.println(answer);
		}
		if(input!=24)
		{
			answer = false;
					System.out.println(answer);
		}
	}
}
