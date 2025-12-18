package employeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OperationCRUD {

    static Connection connection;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "sjbit"
            );

            System.out.println("Connection Established!");

            while (true) {
                System.out.println("\n===== EMPLOYEE MENU =====");
                System.out.println("1. Insert Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertEmployee();
                        break;
                    case 2:
                        viewEmployees();
                        break;
                    case 3:
                        updateEmployee();
                        break;
                    case 4:
                        deleteEmployee();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        connection.close();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CREATE
    static void insertEmployee() throws Exception {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine();
        String ename = scanner.nextLine();

        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();

        String sql = "INSERT INTO employee VALUES (?, ?, ?)";
        PreparedStatement preparedstatement = connection.prepareStatement(sql);

        preparedstatement.setInt(1, id);
        preparedstatement.setString(2, ename);
        preparedstatement.setInt(3, salary);

        int rows = preparedstatement.executeUpdate();
        System.out.println(rows + " Employee Inserted");
    }

    // READ
    static void viewEmployees() throws Exception {
        String sql = "SELECT * FROM employee";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        System.out.println("\nID\tENAME\tSALARY");
        System.out.println("---------------------");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("ename") + "\t" +
                    rs.getInt("salary")
            );
        }
    }

    // UPDATE
    static void updateEmployee() throws Exception {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter New Salary: ");
        int salary = scanner.nextInt();

        String sql = "UPDATE employee SET salary = ? WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, salary);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();
        System.out.println(rows + " Employee Updated");
    }

    // DELETE
    static void deleteEmployee() throws Exception {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM employee WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();
        System.out.println(rows + " Employee Deleted");
    }
}
