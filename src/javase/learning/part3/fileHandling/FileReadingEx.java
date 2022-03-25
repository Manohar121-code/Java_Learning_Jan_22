package javase.learning.part3.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://test/sample.txt");
		int n = 0;
		while ((n = fr.read()) != -1) {
			char ch = (char) n;
			System.out.print(ch);
		}
		fr.close();
	}
}
