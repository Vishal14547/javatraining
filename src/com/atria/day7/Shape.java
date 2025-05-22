package com.atria.day7;

public abstract class Shape {
	protected float area;
	abstract void calarea();
	void show() {
		System.out.println("Area is "+area);
	}

}
