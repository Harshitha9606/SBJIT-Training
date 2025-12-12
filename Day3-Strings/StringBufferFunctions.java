package Day3Excercise;

public class StringBufferFunctions {

	public static void main(String[] args) 
	{
		StringBuffer stringBuffer = new StringBuffer("Hello");
		        
		stringBuffer.append(" World");
	     System.out.println("After append: " + stringBuffer);

	     stringBuffer.insert(5, " Java");
		 System.out.println("After insert: " + stringBuffer);

		 stringBuffer.delete(5, 10); 
		 System.out.println("After delete: " + stringBuffer);

		 stringBuffer.reverse();
		 System.out.println("After reverse: " + stringBuffer);
	  }
}
