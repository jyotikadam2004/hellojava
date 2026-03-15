package com.java.exp3;

public class Main {

	 public static void main(String[] args) { 
	        Manager mngr = new Manager("jyoti", 28 , 70000, 20000); 
	        Employee emp = new Employee("priya", 23 , 60000); 
	 
	        emp.displayInfo(); 
	        System.out.println("Employee Salary: " + emp.calculateSalary()); 
	 
	        mngr.displayInfo(); 
	        System.out.println("Manager Salary: " + mngr.calculateSalary()); 
	 
	        emp.updateEmployeeData("teju");       
	        emp.updateEmployeeData(22);   
	        emp.updateEmployeeData(60000); 
	    } 

}
