package Day2;

public class Fibonacci {

	int value1=0;
	int value2=1;
	
	public void getFibonacci(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(value1);
			int value3=value1+value2;
			value1=value2;
			value2=value3;	
		}
	}
	public static void main(String[] args) {
		
		Fibonacci fibonacci=new Fibonacci();
		fibonacci.getFibonacci(6);
	}

}
