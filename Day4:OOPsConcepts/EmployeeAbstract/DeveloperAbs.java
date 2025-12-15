package Day4Excercise;

public class DeveloperAbs extends EmployeeAbstract {

    private double hourlyRate;
    private int hoursWorked;

    public DeveloperAbs(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        System.out.println("Calculating salary for Developer: " + getName());
        return hourlyRate * hoursWorked;
    }
}
