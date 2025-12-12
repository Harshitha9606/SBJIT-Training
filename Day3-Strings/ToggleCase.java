package Day3Excercise;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Word:");
		String word = scanner.next();

	     String toggled = "";

	     for (int i = 0; i < word.length(); i++)
	     {
	    	 char ch = word.charAt(i);
	    	 if (Character.isUpperCase(ch))
	    	 {
	    		 toggled += Character.toLowerCase(ch);
	    	 } else if (Character.isLowerCase(ch))
	    	 {
	             toggled += Character.toUpperCase(ch);
	         } 
	    	 else 
	    	 {
	             toggled += ch;
	         }
	     }

	        System.out.println("Toggled case: " + toggled);
	        scanner.close();

	    }
	}