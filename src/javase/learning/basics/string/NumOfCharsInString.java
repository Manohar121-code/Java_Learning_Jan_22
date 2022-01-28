package javase.learning.basics.string;

public class NumOfCharsInString {
	public static void main(String[] args) {
		String s = "Program is very easy";
		int count = countOfChar(s, 'a');
		System.out.println(count);
	}
	
	public static int countOfChar(String s, char ch) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ch) {
				count++;
			}
		}
		return count;
	}
}
