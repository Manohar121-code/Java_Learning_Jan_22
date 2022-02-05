package javase.learning.oops.constructor;

public class ConstructorEx {
	public static void main(String[] args) {
//		int i = 10;
		Employee obj = new Employee();
		obj.empId = 1;
		obj.empName = "Mahesh";
		obj.salary = 1234.56;
		
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.salary);
		
		System.out.println("--------------------");
		
		Employee obj2 = new Employee(2, "Lokesh", 876876.68);
		
		System.out.println(obj2.empId);
		System.out.println(obj2.empName);
		System.out.println(obj2.salary);
		
		System.out.println("--------------------");
		
		Employee obj3 = new Employee(3, "Tarun");
		System.out.println(obj3.empId);
		System.out.println(obj3.empName);
		System.out.println(obj3.salary);
		
	}
}
