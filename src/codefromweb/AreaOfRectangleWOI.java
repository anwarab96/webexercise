package codefromweb;

public class AreaOfRectangleWOI {

	public static void main(String[] args) {
		calculateAreaOfRectangle(45,15);
		calculateAreaOfRectangle(12,24);
		calculateAreaOfRectangle(8,12);
		calculateAreaOfSquare(25);
		calculateAreaOfCircle(5);
	}
	public static double calculateAreaOfRectangle( double x, double y){
		double length = x;
		double width = y;
		double arear;
		arear = length*width;
		System.out.println("Area of Rectangle is : " + arear);
		return arear;
	}
	public static double calculateAreaOfSquare(double a){
		double side = a;
		double areas = side*side;
		System.out.println("Area of square is : " + areas);
		return areas; 
	}
	public static double calculateAreaOfCircle(int r){
		int radius = r;
		double areac = Math.PI*(radius*radius);
		System.out.println("The area of circle is : " + areac);
		double circumference= Math.PI*2*radius;
		System.out.println("The circumference of the circle is : " + circumference);
		return areac + circumference;
		
	}

}
