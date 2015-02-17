package com.circleInheritence;

public class Circle extends CircleShape{
	private double area;
	public double area(){
		area= radius*radius*3.14;
		System.out.println("area: "+ area);
		return area;
	}
	@Override
	String getDisplayText() {
		return "area: " + area ;
		
	}
	public void setradius(double radius){
		this.radius= radius;
		
	}

}
