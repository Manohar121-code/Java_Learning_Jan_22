package javase.learning.part3.exceptionHandling;

import java.util.Scanner;

public class ThrowEx {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter age to validate for vote");
		int age = scr.nextInt();
		
		try {
			validateForVote(age);
		} catch (MyException e) {
			System.out.println("MyException occurred - "+ e.getMessage());
		} finally {
			System.out.println("I'll execute for sure");
		}
	}

	private static void validateForVote(int age) throws MyException {
		if (age <= 0) {
			throw new MyException("Age should be positive number");
		}
		
		if (age >= 18) {
			System.out.println("eligible for vote");
		} else {
			System.out.println("not eligible for vote");
		}
	}
}
