package javase.learning.oops.classAndObject;

public class CreateFbUsersEx {
	public static void main(String[] args) {
		//<class_name> identifier = new <class_name>();
		FbSignUp u1 = new FbSignUp();
		u1.name = "Mahesh";
		u1.phone = 5765767;
		u1.email = "Mahesh@gmail.com";
		
		String name1 = u1.name;
		int phone1 = u1.phone;
		String email1 = u1.email;
		
		System.out.println("User1 name - "+ name1);
		System.out.println("User1 phone - "+ phone1);
		System.out.println("User1 email - "+ email1);
		
		System.out.println("-----------------------------");
		
		FbSignUp u2 = new FbSignUp();
		u2.name = "Arjun";
		u2.phone = 8687887;
		u2.email = "Arjun@gmail.com";
		
		System.out.println("User2 name - "+ u2.name);
		System.out.println("User2 phone - "+ u2.phone);
		System.out.println("User2 email - "+ u2.email);
	}
}
