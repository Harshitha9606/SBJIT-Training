package Day2;

public class MergeArrays {

	public static void main(String[] args) {
		
		int[] numbers1= {1,2,3,4,5};
		int[] numbers2= {6,7,8,9,10};
		
		int[] resultArray=new int[numbers1.length+numbers2.length];
		
		for(int i=0;i<numbers1.length;i++)
		{
			resultArray[i]= numbers1[i];
		}
		
		for(int i=0;i<numbers2.length;i++)
		{
			resultArray[numbers1.length+i]=numbers2[i];
		}
		
		System.out.println("Merged Array is:");

		for(int i=0;i<resultArray.length;i++)
		{
			System.out.print(resultArray[i]+" ");
		}
	}
}
