package Day6Excercise;

public class TwoThreadsSynchronized extends Thread {
	private String name; 
	
	public TwoThreadsSynchronized(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("Hello "+name);
	}
}
