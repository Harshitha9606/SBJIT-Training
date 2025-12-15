package Day6Excercise;

public class EvenOddMain {

    public static void main(String[] args) throws InterruptedException {

        Thread evenThread = new Thread(new EvenOdd(0));
        Thread oddThread = new Thread(new EvenOdd(1));

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();

        System.out.println("Both threads executed successfully");
    }
}
