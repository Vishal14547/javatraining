package com.atria.day7;

public class Square extends Shape {
	int side;
	Square(){
		this.side=2;
	}

	@Override
	void calarea() {
		area=side*side;
		
	}
	
}
