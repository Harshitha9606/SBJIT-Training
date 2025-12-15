package Day4Excercise;

public class ManagerAbs extends EmployeeAbstract {

    private double monthlySalary;
    private double bonus;

    public ManagerAbs(String name, double monthlySalary, double bonus) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        System.out.println("Calculating salary for Manager: " + getName());
        return monthlySalary + bonus;
    }
}
