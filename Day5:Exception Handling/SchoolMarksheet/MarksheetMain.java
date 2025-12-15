package Day5Excercise;

public class MarksheetMain {
    public static void main(String[] args) {
        try {
            int[] studentMarks = {85, 92, 78, 88, 95};
            Marksheet m = new Marksheet(studentMarks);
            m.printMarksheet();

            System.out.println();

            int[] invalidMarks = {110, 80, 70, 90, 85};
            Marksheet m2 = new Marksheet(invalidMarks); 
            m2.printMarksheet();

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
