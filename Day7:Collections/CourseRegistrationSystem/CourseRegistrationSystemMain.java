package Day7Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistrationSystemMain {

    private ArrayList<CourseRegistrationSystem> courses = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addCourse() {
    	
        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter course Name: ");
        String courseName = scanner.nextLine();
        
        System.out.print("Enter Course Fees: ");
        double fees = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter Course Duration: ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        courses.add(new CourseRegistrationSystem(courseId, courseName, fees,duration));
        
        
        System.out.println("Course added successfully!");
    }

    public void viewCourse() {
        if (courses.isEmpty()) {
            System.out.println("No course found.");
        } else {
            System.out.println("Course List:");
            for (CourseRegistrationSystem course : courses) {
                System.out.println(course);
            }
        }
    }

    public void updateCourseName() {
        System.out.print("Enter Course ID to update Course Name: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        boolean found = false;

        for (CourseRegistrationSystem course : courses) {
            if (course.getCourseId() == id) {
                System.out.print("Enter new course name: ");
                String name = scanner.nextLine();

                course.setCourseName(name); 
                System.out.println("Course name updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found!");
        }
    }

    public void deleteCourse() {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        boolean removed = courses.removeIf(course -> course.getCourseId() == id);
        if (removed) {
            System.out.println("Course deleted successfully!");
        } else {
            System.out.println("Course not found!");
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("\n--- Course Registration System ---");
            System.out.println("1. Add Course");
            System.out.println("2. View All Course");
            System.out.println("3. Update Course Name");
            System.out.println("4. Delete Course");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addCourse();
                case 2 -> viewCourse();
                case 3 -> updateCourseName();
                case 4 -> deleteCourse();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
    	CourseRegistrationSystemMain course = new CourseRegistrationSystemMain();
        course.menu();
    }
}
