package Day4Excercise;

public class PartTimeEmployee extends EmployeeManagement {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        System.out.println("Calculating salary for part-time employee: " + name);
        return hourlyRate * hoursWorked;
    }
}

