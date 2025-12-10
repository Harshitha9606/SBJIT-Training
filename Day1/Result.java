package Mamatha;

public class Result {

	public void getResult(int value1,int value2,int value3,int value4,int value5) {
		int total=value1+value2+value3+value4+value5;
		System.out.println("The total marks obtained is:"+total);
		
		double percentage=(total/500f)*100;
		System.out.println("The Percentage that you've secured is:"+percentage);
		
	    if(percentage>35)
	    	System.out.println("Congratulations for your results!!!");
	    else
	    	System.out.println("Better Luck Next Time!");	
	}

	public static void main(String[] args) {
		Result result=new Result();
		result.getResult(97, 99, 100, 95, 99);
	}

}
