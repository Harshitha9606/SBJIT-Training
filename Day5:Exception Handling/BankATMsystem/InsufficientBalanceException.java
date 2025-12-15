package Day5Excercise;

@SuppressWarnings("serial")

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

@SuppressWarnings("serial")

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
