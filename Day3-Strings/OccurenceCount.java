package Day3Excercise;

import java.util.Scanner;

public class OccurenceCount {
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word:");
		String word=scanner.next();
		System.out.println("Enter the letter you ant to find its occurence:");
		String input=scanner.next();
		char ch=input.charAt(0);
		int count=0;
		
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("The total occurence of given character is:"+count);
        scanner.close();
	}
}
