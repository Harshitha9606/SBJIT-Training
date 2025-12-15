package Day4Excercise;

public class EmployeeManagement {

    protected String name;

	public EmployeeManagement(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        System.out.println("Base employee salary calculation");
        return 0.0;
    }

    public String getName() {
        return name;
    }
}
