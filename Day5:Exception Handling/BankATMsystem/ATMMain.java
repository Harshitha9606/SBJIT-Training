package Day5Excercise;

public class ATMMain {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(50000);

        try {
            account.withdraw(10000);  
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
