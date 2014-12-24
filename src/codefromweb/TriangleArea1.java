package codefromweb;

public class TriangleArea1 {

	public static void main(String[] args) {
		double area;
		 area = triangleArea(4,4,4);
		 System.out.println("A triangle with sides 4, 4, 4 has an area of: " + area);
		 area = triangleArea(8, 8, 8);
		 System.out.println("A triangle with sides 8, 8, 8 has an area of: " + area);
		 area = triangleArea(15, 10, 10);
		 System.out.println("A triangle with sides 15, 10, 10 has an area of: " + area);
		

	}
	public static double triangleArea(int a , int b, int c)
	{
		int width = a;
		int height = b;
		int length = c;
		double s = (int)(a+b+c)/2;
		double area = s*(s-a)*(s-b)*(s-c);
		return area;
	}
	
}
