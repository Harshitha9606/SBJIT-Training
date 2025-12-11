package Day2;

public class ElementInsertion {

	public static void main(String[] args) {
		
		int[] originalArray = {1, 2, 3, 4, 5, 6, 8};
		int insertElement = 7;             
		int givenPosition = 6;         

	    int[] newArray = new int[originalArray.length + 1];

	    for (int i = 0; i < givenPosition; i++) 
	    {
	    	newArray[i] = originalArray[i];
	    }
	    
	    newArray[givenPosition] = insertElement;

		for (int i = givenPosition; i < originalArray.length; i++) 
		{
			newArray[i + 1] = originalArray[i];
	    }

		System.out.print("Array after insertion: ");
		for (int i = 0; i < newArray.length; i++) 
		{
			System.out.print(newArray[i] + " ");
	    }
	}
}
