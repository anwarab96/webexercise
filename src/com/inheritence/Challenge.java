package com.inheritence;

public class Challenge extends Counter{
	int i=2;
	Counter increment(){
		i++;
		System.out.println("i = "+ i);
		return this;
	}
	
	
//	public static void main(String[] args){
//		
//		Counter cnt = new Counter();
//		 Challenge cl = new Challenge();
//		 System.out.println("Challenge :" );
//		 cl.increment();
		
		
		
	}


