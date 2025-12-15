package Day6Excercise;

public class EvenOdd implements Runnable {

    private int type; 

    public EvenOdd(int type) {
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (type == 0 && i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            } else if (type == 1 && i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}
