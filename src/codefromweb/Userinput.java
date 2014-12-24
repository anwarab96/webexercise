package codefromweb;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// name, age, and salary (double)
		String name;
		int age; 
		double salary;
		System.out.println("what is your name ?");
		name = scan.next();
		System.out.println("How old are you  ?");
		age = scan.nextInt();
		System.out.println("How much do you earn ?");
		
		salary = scan.nextDouble();
	}
	

}
 