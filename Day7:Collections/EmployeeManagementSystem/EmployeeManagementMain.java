package Day7Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementMain {

    private ArrayList<Employee> employees = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        
        employees.add(new Employee(id, name, salary));
        
        System.out.println("Employee added successfully!");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee List:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    public void updateSalary() {
        System.out.print("Enter Employee ID to update salary: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.print("Enter new salary: ");
                double salary = sc.nextDouble();
                emp.setSalary(salary);
                System.out.println("Salary updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        boolean removed = employees.removeIf(emp -> emp.getId() == id);
        if (removed) {
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> updateSalary();
                case 4 -> deleteEmployee();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        Day7Excercise.EmployeeManagementMain employee = new Day7Excercise.EmployeeManagementMain();
        employee.menu();
    }
}
