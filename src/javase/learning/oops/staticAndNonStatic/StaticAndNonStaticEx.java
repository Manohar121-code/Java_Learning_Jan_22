package javase.learning.oops.staticAndNonStatic;

public class StaticAndNonStaticEx {
	public static void main(String[] args) {
		
		FbSignUp.Country = "India";
		
		FbSignUp u1 = new FbSignUp();
		u1.name = "Pradeep";
		u1.phone = 876768;
		u1.email = "pradeep@gmail.com";
		
		System.out.println("User1 name - "+ u1.name);
		System.out.println("User1 phone - "+ u1.phone);
		System.out.println("User1 email - "+ u1.email);
		System.out.println("User1 country - "+ u1.Country);
		
		System.out.println("---------------------------");
		
		FbSignUp u2 = new FbSignUp();
		u2.name = "Lokesh";
		u2.phone = 45645;
		u2.email = "Lokesh@gmail.com";
		
		System.out.println("User2 name - "+ u2.name);
		System.out.println("User2 phone - "+ u2.phone);
		System.out.println("User2 email - "+ u2.email);
		System.out.println("User2 country - "+ u2.Country);
		
		System.out.println("----------------------------");
		
		u1.Country = "USA";
		
		System.out.println("User1 country - "+ u1.Country);
		System.out.println("User2 country - "+ u2.Country);
		
		System.out.println("----------------------------");
		
		u2.Country = "England";
		
		System.out.println("User1 country - "+ u1.Country);
		System.out.println("User2 country - "+ u2.Country);
		
		System.out.println("----------------------------");
		
		String country = FbSignUp.Country;
		System.out.println("Country - "+ country);
		
	}
}
