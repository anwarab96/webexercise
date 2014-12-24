package codefromweb;

import java.util.Scanner;

public class FactorialWInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		//store the entered value in variabe 
		int num = input.nextInt();
		//call the user defined function fact
		int factorial = fact(num);
		System.out.println("Factorial of entered number is : " + factorial);

	}
	public static int fact(int num ){
		int output = num;
		if(num==1){
			return 1;
		}
		//recursion: function calling itself!!
		output = fact(num-1)*num;
		return output;
	}

}
