package Day7Excercise;

public class StudentRegistry {
	
	private int id;
	private String name;
	private String course;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "StudentRegistry [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public StudentRegistry(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
