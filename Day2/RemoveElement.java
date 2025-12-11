package Day2;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5,4,6,7,8};
		
		int[] newArray=new int[numbers.length];
		
		int deleteElement=4;
		
		System.out.println("The Array after removing all occurances of an element 4:");
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]!=deleteElement)
			{
				newArray[i]=numbers[i];
				System.out.println(newArray[i]+" ");
			}
		}
	}
}
