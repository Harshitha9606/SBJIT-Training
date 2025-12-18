package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UsingInsertWithLoop {
	
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
			
			//3.SQL insert query
			
			String sql="insert into students values(?,?)";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
						
			System.out.println("Enter how many students you want to add:");
			int number=scanner.nextInt();
			scanner.nextLine();
			
			for(int i=1;i<=number;i++) {
				System.out.println("Enter the student ID:");
				int id=scanner.nextInt();
				
				scanner.nextLine();
				System.out.println("Enter the student name:");
				String name=scanner.nextLine();
				
				preparedstatement.setInt(1, id);
				preparedstatement.setString(2, name);
				preparedstatement.addBatch();
			
			}
			
			int[] rows=preparedstatement.executeBatch();
			System.out.println(rows.length+" record inserted");
	
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

