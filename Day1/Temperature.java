package Mamatha;

public class Temperature {

	public void covertTemperature(float celsius) {
		
		float Fahrenheit=(celsius*9/5)+32;
		System.out.println("The coverted Fahrenheit value is:"+Fahrenheit);
		
	}

	public static void main(String[] args) {

		Temperature temperature=new Temperature();
		temperature.covertTemperature(34.42f);
	}

}
