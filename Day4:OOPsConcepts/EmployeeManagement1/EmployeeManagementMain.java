package Day4Excercise;

public class EmployeeManagementMain {

    public static void main(String[] args) {

    	EmployeeManagement employee1 = new FullTimeEmployee("Alice", 50000.0);
    	EmployeeManagement employee2 = new PartTimeEmployee("Bob", 500.0, 80);

        System.out.println(employee1.getName() + "'s salary: " + employee1.calculateSalary());
        System.out.println(employee2.getName() + "'s salary: " + employee2.calculateSalary());
    }
}
