package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UsingUpdate {
	
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
			
			String update="UPDATE students SET name= ? where id= ?";
			PreparedStatement preparedstatement=connection.prepareStatement(update);
			
			System.out.println("Enter the id you wanted to update:");
			int id=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter the name you wanted to updated as:");
			String name=scanner.nextLine();
			
			preparedstatement.setString(1, name);
			preparedstatement.setInt(2, id);
			
			
			int rows=preparedstatement.executeUpdate();
			System.out.println(rows+ " rows updated");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
