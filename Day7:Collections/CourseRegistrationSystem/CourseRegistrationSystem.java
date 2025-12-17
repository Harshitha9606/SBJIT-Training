package Day7Excercise;

public class CourseRegistrationSystem {
	
	private int courseId;
	private String CourseName;
	private double fees;
	private int duration;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public CourseRegistrationSystem(int courseId, String courseName, double fees, int duration) {
		super();
		this.courseId = courseId;
		CourseName = courseName;
		this.fees = fees;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "CourseRegistrationSystem [courseId=" + courseId + ", CourseName=" + CourseName + ", fees=" + fees
				+ ", duration=" + duration + "]";
	}
	
	
	
}
