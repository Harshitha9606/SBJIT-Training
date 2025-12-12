package Day3Excercise;

import java.util.Scanner;

public class FrequencyCharacter 
{
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scanner.next();
		
		 boolean[] visited = new boolean[word.length()];

	        for (int i = 0; i < word.length(); i++) 
	        {

	            if (visited[i]) {
	                continue;
	            }

	            int count = 1;

	            for (int j = i + 1; j < word.length(); j++) 
	            {
	                if (word.charAt(i) == word.charAt(j)) {
	                    visited[j] = true;
	                    count++;
	                }
	            }

	            System.out.println(word.charAt(i) + " → " + count);
	            scanner.close();
	        }
	    }
     }