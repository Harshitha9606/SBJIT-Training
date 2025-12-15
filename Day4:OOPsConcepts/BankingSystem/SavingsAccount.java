package Day4Excercise;

public class SavingsAccount extends BankingSystem {
	
	public void deposit(int amount)
	{
		System.out.println("Deposited amount in your Savings Account is:"+amount);
	}
	public void withdraw(int amount)
	{
		 System.out.println("Your withdrawn account from your Savings Account is:"+amount);
	}
	public void displayBalance()
	{
		int currentBalance=50000;
		System.out.println("The current balance in your Savings account is:"+currentBalance);
	}
}
