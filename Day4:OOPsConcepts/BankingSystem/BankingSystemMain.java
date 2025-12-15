package Day4Excercise;

public class BankingSystemMain {

	public static void main(String[] args) {
		
		System.out.println("\n=========From Super Class=============");
		
		BankingSystem bankingsystem=new BankingSystem();
		bankingsystem.deposit(25000);
		bankingsystem.displayBalance();
		bankingsystem.withdraw(10000);
		
		System.out.println("\n=========From derived 1 Class=============");

		SavingsAccount savingsAccount=new SavingsAccount();
		savingsAccount.deposit(30000);
		savingsAccount.displayBalance();
		savingsAccount.withdraw(30000);
		
		System.out.println("\n=========From Derived 2 Class=============");

		
		CurrentAccount ca=new CurrentAccount();
		ca.deposit(20000);
		ca.displayBalance();
		ca.withdraw(15000);
	}

}
