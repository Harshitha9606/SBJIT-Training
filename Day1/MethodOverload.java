package Mamatha;

public class MethodOverload {

	public void add(int value1,int value2) {
		System.out.println(value1+value2);
	}
	public void add(float value3,float value4) {
		System.out.println(value3+value4);
	}
	public void add(String name) {
		System.out.println("Hello"+name);
	}

	public static void main(String[] args) {
		MethodOverload methodoverload=new MethodOverload();
		methodoverload.add("MAMATHA");
		methodoverload.add(203.09f, 45.99f);
		methodoverload.add(345,67);
		methodoverload.add("Monisha");
	}

}
