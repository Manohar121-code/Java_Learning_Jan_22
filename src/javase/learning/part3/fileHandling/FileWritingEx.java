package javase.learning.part3.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingEx {
	public static void main(String[] args) throws IOException {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter data to write into the file");
		String data = scr.nextLine();
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("D://test/sample.txt", true);
			fw.write(data);
			System.out.println("Writing data to file has been successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			fw.close();
		}
	}
}
