package com.atria.day4;

public class Person {
	private String name;
	private int income;
	private String gender;
	private int age;
	private String tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	
	
	
}
