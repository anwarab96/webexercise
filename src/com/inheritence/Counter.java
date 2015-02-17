package com.inheritence;

public class Counter {
	static int i = 0;
	  Counter increment(){
		
		i++;
		System.out.println("i = " + i);
		return this;
	}
	void print(){
		
	}

}

