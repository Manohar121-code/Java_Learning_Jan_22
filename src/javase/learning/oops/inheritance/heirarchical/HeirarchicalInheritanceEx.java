package javase.learning.oops.inheritance.heirarchical;

public class HeirarchicalInheritanceEx {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setNumOfTires(4);
		v.setNumOfGears(4);
		
		System.out.println(v.getNumOfTires());
		System.out.println(v.getNumOfGears());
		
		System.out.println("--------------------");
		
		Car skoda = new Car();
		skoda.setNumOfTires(4);
		skoda.setNumOfGears(6);
		skoda.setCc(2000);
		skoda.setMileage(14);
		
		System.out.println(skoda.getNumOfTires());
		System.out.println(skoda.getNumOfGears());
		System.out.println(skoda.getCc());
		System.out.println(skoda.getMileage());
		
		System.out.println("--------------------");
		
		Bus tata = new Bus();
		tata.setNumOfTires(10);
		tata.setNumOfGears(4);
		tata.setSeatCapacity(50);
		tata.setTopSpeed(60);
		
		System.out.println(tata.getNumOfTires());
		System.out.println(tata.getNumOfGears());
		System.out.println(tata.getSeatCapacity());
		System.out.println(tata.getTopSpeed());
	}
}
