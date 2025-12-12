package Day3Excercise;

import java.util.Scanner;

public class InputOutputBased {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a two-word sentence: ");
	    String input = sc.nextLine();

	    String[] words = input.split(" ");

		String firstWord = words[0];
		String secondWord = words[1];

	    String part1 = firstWord.substring(0, 2);

		String part2 = secondWord.substring(secondWord.length() - 2);

	    String result = part1 + part2;

		System.out.println("Output: " + result);

		sc.close();
       }
	}
