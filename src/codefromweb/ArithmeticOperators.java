package codefromweb;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		calculateValues();
		
	}

	private static void calculateValues() {
		 int  x, y;
		 int resulta, results, resultm;
		 float resultd;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value of x : ");
		  x = input.nextInt();
		System.out.println("Enter a value of y : ");
		 y = input.nextInt();
		 resulta = x + y;
		results = x - y;
		resultm = x*y;
		resultd = x/y;
	System.out.println("The result of adding is : " + resulta);
	System.out.println("The result of subtracting is : " + results);
	System.out.println("The result of multiplying is : " + resultm);
	System.out.println("The result of dividing is : " + resultd);
}
}
