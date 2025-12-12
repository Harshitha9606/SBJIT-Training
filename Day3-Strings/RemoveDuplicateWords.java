package Day3Excercise;

import java.util.Scanner;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence=scanner.nextLine();
		
		String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++)
        {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) 
            {
                if (words[i].equals(words[j])) 
                {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate)
            {
                if (!result.isEmpty()) 
                {
                    result += " ";
                }
                result += words[i];
            }
        }

        System.out.println("Sentence without duplicates: " + result);
        scanner.close();
    }
}