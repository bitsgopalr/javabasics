package com.basics;

public class Employee {
	private String firstName, lastName;
	private double monthlySalary;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary < 0.0) this.monthlySalary = 0.0;
		else this.monthlySalary = monthlySalary;
	}
	
}
