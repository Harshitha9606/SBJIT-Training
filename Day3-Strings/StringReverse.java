package Day3Excercise;
 
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Word:");
		String word=scanner.next();
		
		for(int i=word.length()-1;i>=0;i--)
		{
			System.out.print(word.charAt(i));
		}	
        scanner.close();

	}
}
