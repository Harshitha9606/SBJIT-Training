package Day2;

public class SecondSmallLarge {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50};
		
		int smallest=numbers[0];
		int largest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
		}
		System.out.println("The smallest element is:"+smallest);
		System.out.println("the largest element is:"+largest);
		
	
		int secondsmall=largest;
		int secondlarge=smallest;
		

		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] > smallest && numbers[i] < secondsmall )
			{
				secondsmall= numbers[i];
			}
			if(numbers[i] < largest && numbers[i] > secondlarge )
			{
				secondlarge=numbers[i];
			}
		}
		System.out.println("The second smallest element is:"+secondsmall);
		System.out.println("The second largest element is:"+secondlarge);
	}
}

