package Day5Excercise;

public class Marksheet {
    private int[] marks; 
    private static final int TOTAL_SUBJECTS = 5;

    public Marksheet(int[] marks) throws InvalidMarksException {
        if (marks == null || marks.length != TOTAL_SUBJECTS) {
            throw new InvalidMarksException("Exactly 5 subject marks required");
        }

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException("Invalid mark found: " + mark);
            }
        }

        this.marks = marks;
    }

    public int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getPercentage() {
        return (getTotal() / (double) (TOTAL_SUBJECTS * 100)) * 100;
    }

    public String getGrade() {
        double percentage = getPercentage();
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B+";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else return "F";
    }

    public void printMarksheet() {
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + getTotal());
        System.out.printf("Percentage: %.2f%%\n", getPercentage());
        System.out.println("Grade: " + getGrade());
    }
}

