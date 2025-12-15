package Day4Excercise;

public class BankingSystem {

		public void deposit(int amount)
		{
			System.out.println("Deposited amount in Rupees:"+amount);
		}
		public void withdraw(int amount)
		{
			 System.out.println("Your withdrawn account is:"+amount);
		}
		public void displayBalance()
		{
			int currentBalance=20000;
			System.out.println("The current balance in your account is:"+currentBalance);
		}

}
