package com.basics;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name    : ");
		employee1.setFirstName(scanner.next());
		System.out.println("Enter Last Name     : ");
		employee1.setLastName(scanner.next());
		System.out.println("Enter Montly Salary : ");
		employee1.setMonthlySalary(scanner.nextDouble());
		
		double employee1YearlySalary =  employee1.getMonthlySalary() * 12;
		
		System.out.println("Employee1 Yearly Salary : "+employee1YearlySalary);		
		System.out.println("Employee1 Yearly Salary after 10% Raise : "+(employee1YearlySalary + employee1YearlySalary * 0.10));

	}
}
