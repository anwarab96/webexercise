package codefromweb;

public class TriangleArea {

	public static void main(String[] args) {
		 calculate(10, 5 , 1);

	}

	private static void calculate(int i, int j, int k) {
		// create three ints
		int a =i, b = j, c=k;
		
		// assign params to ints
		// wrtie the formula using 
		int s =(a+b+c)/2;
		int area = s*(s-a)*(s-b)*(s-c);
		System.out.println("area is "+ area);
		
		
	}
	

}
