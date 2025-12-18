package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UsingSelect {
	
	public static void main(String[] args) {
		try {  //1. loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. creating connection
			Connection connection=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student",
					"root",
					"sjbit"
					);
			
			System.out.println("connection Established!");
			
			/* 3.SQL insert query
			
			String sql="insert into students values(?,?)";
			
			
			//4. prepare statement
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the student ID:");
			int id=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the student name:");
			String name=scanner.nextLine();
			
			preaparedstatement.setInt(1, id);
			preaparedstatement.setString(2, name);
			
			//Execute Insert
			int rows=preaparedstatement.executeUpdate();
			System.out.println(rows+" record inserted");
			
			*/
			

			String select="Select * from students";
			
			PreparedStatement preaparedstatement=connection.prepareStatement(select);

			
			ResultSet resultset=preaparedstatement.executeQuery(select);
			
			   System.out.println("\nStudent Records:");
			   System.out.println("\nID  Names:");
			   
	            while (resultset.next()) {
	                System.out.println(
	                		resultset.getInt(1) + "--" + resultset.getString(2)
	                );
	            }
	            
			//close connection
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

