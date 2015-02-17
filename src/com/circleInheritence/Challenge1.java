package com.circleInheritence;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius for circle");
		double radius = scan.nextDouble();
		
	
		Circle cle= new Circle();
		cle.setradius(radius);
		cle.area();
		
//		System.out.println(cle.getDisplayText());
		
	
	

}
}
