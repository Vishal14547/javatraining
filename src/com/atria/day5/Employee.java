package com.atria.day5;

public class Employee extends Person {
	private int empid;
	private float salary;
	private String dept;
	public Employee(String name,String city,int empid,float salary,String dept) {
		super(name,city);
		this.dept=dept;
		this.empid=empid;
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
}
