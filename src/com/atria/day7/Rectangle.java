package com.atria.day7;

public class Rectangle extends Shape {
	int l;
	int b;
	Rectangle(){
		this.l=2;
		this.b=4;
	}

	@Override
	void calarea() {
		area=l*b;
		
	}

}
