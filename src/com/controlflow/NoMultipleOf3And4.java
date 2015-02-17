package com.controlflow;

import java.util.Scanner;

public class NoMultipleOf3And4 {

	public static void main(String[] args) {
				//print number 1 to 100, except multiple of 3,4;
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a number: ");
				int input = scan.nextInt();
				int num = 100;
				for(int i= 1; i<num; i++)
				{
					boolean print = false;
					if(i%3==0)
					{
						print=true;
					}
					if(i%4==0)
					{
						print=true;
					}
//					if(Integer.toString(i).indexOf("3")!=-1)
					{			
//						printed = true;	
//					}
//					if(Integer.toString(i).indexOf("4")!=-1)
						{
//						printed=true;
						}
					if(print==false)
					{
						System.out.print("print " + i);
					System.out.println("");
					}

			}
				}
			}
	}


