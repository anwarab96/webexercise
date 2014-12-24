package codefromweb;

import java.util.Scanner;

public class AreaOfTrangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width of the Triangle:");
		double base = input.nextDouble();
		System.out.println("Enter the height of the Triangle:");
		double height = input.nextDouble();
		//area = (width*height)/2
		double area = (base*height)/2;
		System.out.println("Area of Triangle is: " + area);

	}

}
