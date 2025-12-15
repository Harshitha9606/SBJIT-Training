package Day4Excercise;


public class FullTimeEmployee extends EmployeeManagement {

    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {

        System.out.println("Calculating salary for full-time employee: " +name);
        return monthlySalary;
    }
}
