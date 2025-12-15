package Day6Excercise;

public class ThreadPrioritiesMain {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new ThreadPriorities("Java"));
		thread1.setPriority(1);
		thread1.start();
		
		Thread thread2=new Thread(new ThreadPriorities("Science"));
		thread2.setPriority(10);
		thread2.start();
	
	}

}
