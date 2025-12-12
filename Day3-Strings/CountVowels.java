package Day3Excercise;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scanner.next();
		
		int count=0;
		
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		System.out.println("The total count of the vowels present in the given word is:" +count);
        scanner.close();
	}

}
