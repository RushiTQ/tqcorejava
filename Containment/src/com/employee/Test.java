package com.employee;

import java.util.Scanner;

public class Test {
	static 	Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
	Employee em = new Employee();
	informationOfEmpl(em);
	
}
public static void informationOfEmpl(Employee e) {
	System.out.println("Enter employee id");
	e.setId(scan.nextInt());
	System.out.println("Enter employee name");
	e.setName(scan.next());
	System.out.println("Enter employee salary");
	e.setSalary(scan.nextInt());
	System.out.println("Enter employee department");
	e.setDepartment(scan.next());
	
}
}
