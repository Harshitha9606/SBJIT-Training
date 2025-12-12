package Day3Excercise;

import java.util.Scanner;

public class RemoveSpecficCharacter {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scanner.next();
		
        System.out.println("Enter a character you want to remove:");
        char character = scanner.next().charAt(0);

        String resultWord = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != character) {
                resultWord += ch;  
            }
        }

        System.out.println("The string after removing all occurrences of '" + character + "': " + resultWord);
        scanner.close();
    }
}