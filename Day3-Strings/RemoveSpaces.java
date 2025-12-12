package Day3Excercise;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence=scanner.nextLine();
		
		String result = "";

	    for (int i = 0; i < sentence.length(); i++) 
	    {
	    	char ch = sentence.charAt(i);
	    	if (ch != ' ') 
	    	{
	    		result += ch;
	        }
	    }
	    System.out.println("The sentence after removing spaces: " + result);
        scanner.close();
	  }
	}