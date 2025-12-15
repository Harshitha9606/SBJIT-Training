package Day4Excercise;

public class CurrentAccount extends BankingSystem{
	
	public void deposit(int amount)
	{
		System.out.println("Deposited amount in your Current Account is:"+amount);
	}
	public void withdraw(int amount)
	{
		 System.out.println("Your withdrawn account from your Current Account is:"+amount);
	}
	public void displayBalance()
	{
		int currentBalance=40000;
		System.out.println("The current balance in your Current account is:"+currentBalance);
	}

}
