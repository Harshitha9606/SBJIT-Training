package Mamatha;

public class Swap {
	//int a=10;
	//int b=200;
	
	public void withVariable(int value1,int value2) {
		int value3;
		System.out.println("Using the Third Variable");
		System.out.println("Before Swapping:"+value1+","+value2);
		value3=value1;
		value1=value2;
		value2=value3;
		System.out.println("After Swapping:"+value1+","+value2);
	}
	
	public void withoutVariable(int value3,int value4) {
		System.out.println("------------------------------------");
		System.out.println("Without using the Third Variable!");
		System.out.println("Before Swapping:"+value3+","+value4);
		value3=value3+value4;
		value4=value3-value4;
		value3=value3-value4;
		System.out.println("After Swapping:"+value3+","+value4);
	}

	public static void main(String[] args) {
		Swap swap=new Swap();
		swap.withVariable(150,300);
		swap.withoutVariable(400,250);

	}

}
