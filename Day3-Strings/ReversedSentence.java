package Day3Excercise;

import java.util.Scanner;

public class ReversedSentence {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
	    String sentence = sc.nextLine();
	    
	    String[] words = sentence.split(" ");

	    String result = "";
	    
	    for (int i = words.length - 1; i >= 0; i--) 
	    {
	    	result += words[i];
	    	if (i != 0)
	    	{
	    		result += " ";
	        }
	    }

	        System.out.println("Reversed sentence: " + result);

	        sc.close();
    }
}
