package javase.learning.oops.inheritance;

public class InheritanceEx {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.setId(1);
		p.setName("Umesh");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		
		System.out.println("----------------------");
		
		Child c = new Child();
		c.setId(1);
		c.setName("Lokesh");
		c.setPhone(76576);
		c.setAddress("Bangalore");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPhone());
		System.out.println(c.getAddress());
		
		System.out.println("------------------------");
		String string = c.toString();
		System.out.println(string);
		
		System.out.println(p.toString());
		
		System.out.println(p);
		System.out.println(c);
		
		int i = 10;
		System.out.println(i);
	}
}
