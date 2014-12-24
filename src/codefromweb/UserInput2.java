package codefromweb;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		getInformation();
	}

	private static void getInformation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your First name?");
		String firstname = scan.next();
		System.out.println("What is you last name?");
		String lastname = scan.next();
		System.out.println("What grade are you studying?");
		String grade = scan.next();
		System.out.println("What is your id number?");
		int studentId = scan.nextInt();
// login name
		//GPA (0.00 to 4.00)
		System.out.println("write your login name");
		String loginName = scan.next();
		System.out.println("What is your gpa?");
	double gpa = scan.nextDouble();
	}

}