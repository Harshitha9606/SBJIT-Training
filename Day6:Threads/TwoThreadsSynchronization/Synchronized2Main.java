package Day6Excercise;

public class Synchronized2Main {

	public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new TwoThreadsSynchronized("Mamatha"));
        Thread thread2 = new Thread(new TwoThreadsSynchronized("Monisha"));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Both threads executed successfully");

	}

}
