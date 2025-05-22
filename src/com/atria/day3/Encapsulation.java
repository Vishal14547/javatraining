package com.atria.day3;

public class Encapsulation {
	private int slno=1;
	private int age;
	private String name;
	

	public int getSlno() {
		return slno;
	}


	public void setSlno(int slno) {
		this.slno = slno;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	public String toString1() {
		return " [slno=" + slno + ", age=" + age + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
