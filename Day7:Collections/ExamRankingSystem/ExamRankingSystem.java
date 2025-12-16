package Day7Excercise;

public class ExamRankingSystem implements Comparable<ExamRankingSystem> {
	
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public ExamRankingSystem(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	@Override
    public int compareTo(ExamRankingSystem other) {
       
        return Integer.compare(other.marks, this.marks);
    }
	
	@Override
	public String toString() {
		return  name + " - " + marks;
	}

}
