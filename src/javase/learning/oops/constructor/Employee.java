package javase.learning.oops.constructor;

public class Employee {
	int empId;
	String empName;
	double salary;
	
	//Syntax
//	<access_modifier> <class_name>() {
//		
//	}
	
	public Employee() {
		System.out.println("Employee Constructor called");
	}
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
}
