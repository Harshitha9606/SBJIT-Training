package Day7Excercise;

import java.util.ArrayList;

public class StudentRegistryMain {
	
	public static void main(String[] args)
	{
		ArrayList<StudentRegistry> students=new ArrayList<StudentRegistry>();
		
		StudentRegistry student1=new StudentRegistry(27,"Mamatha.S","Java Full Stack");
		StudentRegistry student2=new StudentRegistry(37,"Monisha.K","Web Development");
		StudentRegistry student3=new StudentRegistry(25,"Madhushree.P.V","Java Full Stack");
		StudentRegistry student4=new StudentRegistry(36,"Monika.J","Python Full Stack");
		StudentRegistry student5=new StudentRegistry(10,"Anjali","Data Analytics");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);	
	
		
		for(StudentRegistry student:students)
		{
			System.out.println(student);
		}
		
		System.out.println("Searching for Student by id:");

		int searchId = 87;
		boolean found = false;

		for (StudentRegistry student : students) {
		    if (student.getId() == searchId) {
		        System.out.println("Student Found: " + student);
		        found = true;
		        break;
		    }
		}

		if (!found) {
		    System.out.println("Student with ID " + searchId + " not found");
		}

	}

}
