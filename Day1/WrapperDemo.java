package Mamatha;

public class WrapperDemo {

	public  static void main(String[] args) {	
		int value1=100;
		System.out.println("The value of Primitive datatype-int:"+value1);
		
		System.out.println("---------------------------------------------------");
		//Integer integer=new Integer(value1);
		Integer integer=value1;
		System.out.println("The value of Wrapper class-Integer: "+integer);	
	}
}
