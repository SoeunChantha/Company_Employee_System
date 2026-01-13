package com.company.employee;

public class Employee {
	String name;
	int age;
	char gender;
	double salary;
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		Employee em = new Employee();
		em.name = "Soeun Chantha";
		em.age = 23;
		em.gender = 'M';
		em.salary = 2500;
		
		em.displayInfo();
	}
	

}
