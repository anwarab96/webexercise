package codefromweb;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		rectangleArea();
	}

	private static void rectangleArea() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		double length = input.nextDouble();
		System.out.println("Enter the width of rectangle: ");
		double width = input.nextDouble();
		//Area = length* width;
		double area = length* width;
		System.out.println("the area of Rectangle is : " + area);
	}

}
