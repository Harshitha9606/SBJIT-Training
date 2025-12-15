package Day4Excercise;

public class EmployeeAbsMain {

    public static void main(String[] args) {

        EmployeeAbstract employee1 = new ManagerAbs("Alice", 70000, 10000);
        EmployeeAbstract employee2 = new DeveloperAbs("Bob", 600, 160);

        System.out.println(employee1.getName() + "'s salary: " + employee1.calculateSalary());
        System.out.println(employee2.getName() + "'s salary: " + employee2.calculateSalary());
    }
}
