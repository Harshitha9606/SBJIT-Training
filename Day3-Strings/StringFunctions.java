package Day3Excercise;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the word:");
		String word=scanner.next();
		String word2="hi";
		
		System.out.println(word.length());
		System.out.println(word.charAt(5));
		System.out.println(word.compareTo("hello"));
		System.out.println(word.concat("Welcome"));
		System.out.println(word.endsWith(word2));
		}
}
