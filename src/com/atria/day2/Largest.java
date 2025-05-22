package com.atria.day2;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=5;
		if(a>b) {
			if(a>c) {
				System.out.println("A is largest");
			}
			else
				System.out.println("C is largest");
			
		}
		else if(b>c) {
			if(b>a)
				System.out.println("B is largest");
		}
		else {
			System.out.println("C is largest");
		}

	}

}
