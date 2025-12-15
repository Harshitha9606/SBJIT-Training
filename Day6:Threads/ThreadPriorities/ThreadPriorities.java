package Day6Excercise;

public class ThreadPriorities implements Runnable{
	
	private String word;

	public ThreadPriorities(String word) {
		this.word=word;
	}

	@Override
	public void run() {
		System.out.println("Welcome To "+word);
	}
}
