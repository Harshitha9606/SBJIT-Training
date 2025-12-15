package Day5Excercise;

@SuppressWarnings("serial")
public class LimitExceededException extends Exception {
    public LimitExceededException(String message) {
        super(message);
    }
}