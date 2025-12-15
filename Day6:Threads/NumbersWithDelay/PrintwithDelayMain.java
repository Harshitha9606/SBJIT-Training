package Day6Excercise;

public class PrintwithDelayMain {

	public static void main(String[] args) throws InterruptedException {
		
		 Thread thread=new Thread(new PrintwithDelay());
		
		thread.start();
	}

}
