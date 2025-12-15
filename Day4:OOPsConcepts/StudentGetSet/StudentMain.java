package Day4Excercise;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 101, 95);

        student1.displayDetails();

        student1.setMarks(120); 
        student1.displayDetails();

        student1.setMarks(88);
        student1.displayDetails();
    }
}
