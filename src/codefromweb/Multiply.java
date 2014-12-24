package codefromweb;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("write a number for book");
//		int book = scan.nextInt();
//		System.out.println("write a number for pen");
//		int pen = scan.nextInt();
//		multiplyNumber(   book, pen);
//		addNum(10,55);
//		subNum(55, 35);
//		numbers(26);	
		int a = 10;
		int b= 100-a;
		}
	public static void multiplyNumber(int a, int b){
		int num1= a;
		int num2 = b;
		int num3 = num1*num2;
		System.out.println(num3);
	}
	public static void addNum(int x, int y){
		int num3 = x ;
		int num4 = y;
		System.out.println(x+y);
	}
	public static void subNum(int a, int b){
		System.out.println(a - b);
	}
	public static void numbers(int x){
		int num =x;
		if (num %2==0){
			System.out.println("num is even");	
		}else 
			System.out.println("num is odd");
	}
	
	
}
