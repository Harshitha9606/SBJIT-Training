package Day4Excercise;

public abstract class EmployeeAbstract {

    private String name;

    public EmployeeAbstract(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}
