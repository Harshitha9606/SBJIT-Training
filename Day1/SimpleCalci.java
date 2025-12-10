package Mamatha;

public class SimpleCalci {

	public void add(int value1,int value2) {
		int result=value1+value2;
		System.out.println(result);
	}
	public void subtract(int value1,int value2) {
		int result=value1-value2;
		System.out.println(result);
	}
	public void multiply(int value1,int value2) {
		int result=value1*value2;
		System.out.println(result);
	}
	public void divide(int value1,int value2) {
		int result=value1/value2;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		System.out.println("-----SIMPLE CALCULATOR-----");
		SimpleCalci simplecalci=new SimpleCalci();
		simplecalci.add(27,67);
		simplecalci.subtract(399,87);
		simplecalci.multiply(88, 90);
		simplecalci.divide(65, 8);
	}

}
