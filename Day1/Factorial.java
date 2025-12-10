package Mamatha;

public class Factorial {

	public void getFactorial(int value1) {
		int fact=1;
		for(int i=1;i<=value1;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of a given number is:"+fact);
	}

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		factorial.getFactorial(5);
	}
}
