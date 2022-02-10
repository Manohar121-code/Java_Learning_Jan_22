package javase.learning.oops.inheritance.multiLevel;

public class MultiLevelInheritanceEx {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setNumOfTires(2);
		v.setNumOfGears(4);
		System.out.println(v.getNumOfTires());
		System.out.println(v.getNumOfGears());
		
		System.out.println("---------------------");
		
		Car polo = new Car();
		polo.setNumOfTires(4);
		polo.setNumOfGears(6);
		polo.setCc(1500);
		polo.setMileage(18);
		
		System.out.println(polo.getNumOfTires());
		System.out.println(polo.getNumOfGears());
		System.out.println(polo.getCc());
		System.out.println(polo.getMileage());
		
		System.out.println("---------------------");
		
		SuperCar bugatti = new SuperCar();
		bugatti.setNumOfTires(4);
		bugatti.setNumOfGears(8);
		bugatti.setCc(3000);
		bugatti.setMileage(5);
		bugatti.setCompany("Bugatti");
		bugatti.setTopSpeed(400);
		bugatti.setRoofTop(true);
		
		System.out.println(bugatti.getNumOfTires());
		System.out.println(bugatti.getNumOfGears());
		System.out.println(bugatti.getCc());
		System.out.println(bugatti.getMileage());
		System.out.println(bugatti.getCompany());
		System.out.println(bugatti.getTopSpeed());
		System.out.println(bugatti.isRoofTop());
		
	}
}
