package jdbcDemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UsingDelete {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		try {  //1. loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. creating connection
			Connection connection=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student",
					"root",
					"sjbit"
					);
			
			System.out.println("connection Established!");
			
			String delete="delete from students where id= ?";
			PreparedStatement preparedstatement=connection.prepareStatement(delete);
			
			System.out.println("Enter the id you want to delete:");
			int id=scanner.nextInt();
			scanner.nextLine();
			
			preparedstatement.setInt(1, id);
			
			int rows=preparedstatement.executeUpdate();
			System.out.println(rows+ " rows deleted");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
