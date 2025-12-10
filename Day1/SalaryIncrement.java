package Mamatha;

public class SalaryIncrement {

	public void getIncrement(int basicSalary,double bonusPercentage) {
		
		double finalSalary=basicSalary+(basicSalary*bonusPercentage/100);
		System.out.println("The Updated Salary is:"+finalSalary);
		
	}

	public static void main(String[] args) {
		
		SalaryIncrement salaryincrement=new SalaryIncrement();
		salaryincrement.getIncrement(30000, 30.0);

	}
}
