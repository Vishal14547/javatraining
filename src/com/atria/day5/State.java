package com.atria.day5;

public class State  extends Country{
	private String StateName;
	private String Area;
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "State [StateName=" + StateName + ", Area=" + Area + "]";
	}
	
	
}
