package Day5Excercise;

import java.util.Scanner;

public class StudentManagementSystem {

 public static Student searchStudentById(Student[] students, int searchId)
         throws StudentNotFoundException {

     for (Student s : students) {
         if (s.id == searchId) {
             return s;
         }
     }
     throw new StudentNotFoundException("Student with ID " + searchId + " not found.");
 }

 public static void main(String[] args) {
     Student[] students = new Student[3];
     students[0] = new Student(101, "Mamatha", 99.0);
     students[1] = new Student(102, "Harshi", 89.5);
     students[2] = new Student(103, "Rajesh", 95.3);

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Student ID to search: ");
     int id = sc.nextInt();

     try {
         Student foundStudent = searchStudentById(students, id);
         System.out.println("\nStudent Found:");
         foundStudent.display();
     } catch (StudentNotFoundException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}

