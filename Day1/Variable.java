package Mamatha;

public class Variable {
	static String college="VTU CPGS";
	
	public void getInfo(String name,String college) {
		System.out.println(name+"-"+college);
	}

	public static void main(String[] args) {
		Variable variable1=new Variable();
		variable1.getInfo("Mamatha",college);
		Variable variable2=new Variable();
		variable2.getInfo("Monisha",college);
	}

}
