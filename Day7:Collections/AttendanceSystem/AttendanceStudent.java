package Day7Excercise;

import java.util.Objects;

public class AttendanceStudent {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AttendanceStudent(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		AttendanceStudent other = (AttendanceStudent) object;
			return name == other.name && Objects.equals(name, other.name);
		}

	@Override
	public String toString() {
		return "AttendanceStudent [name=" + name + "]";
	}
	
}
