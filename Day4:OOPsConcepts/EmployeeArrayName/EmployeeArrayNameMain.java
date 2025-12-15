package Day4Excercise;

public class EmployeeArrayNameMain {

    public static void main(String[] args) {

    	EmployeeArrayName[] employees = new EmployeeArrayName[5];

        employees[0] = new EmployeeArrayName("Harshi");
        employees[1] = new EmployeeArrayName("Moni");
        employees[2] = new EmployeeArrayName("Ishaarsh");
        employees[3] = new EmployeeArrayName("Monika"); 
        employees[4] = new EmployeeArrayName("Madhu");

        System.out.println("Reversed names of all employees:");

        for (EmployeeArrayName emp : employees) {
            System.out.println(emp.getName() + " → " + emp.reverseName());
        }
    }
}
