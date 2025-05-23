package com.atria.day8;

public class FinalVariable {
	final int x = 100;
	final static int y;
	final static int z = 10;
	
	void change()
	{
		x=30;
		y=100;
		
	}
	
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + " , y" + y + ")";
	}
	//Declare a static block to initiallize the final static variable,
	static {
		y=20;
		z=100;//once intialized can't be reassigned 
		System.out.println("VAlue of y: " +y);
	}
    	

}
