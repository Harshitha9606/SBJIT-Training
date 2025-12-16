package Day7Excercise;

import java.util.Objects;

public class EmployeeEmails {
	
	private int id;
	private String email;

	public EmployeeEmails(int id, String email) {
		this.id = id;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, email);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		EmployeeEmails other = (EmployeeEmails) object;
			return id == other.id && Objects.equals(email, other.email);
		}

	@Override
	public String toString() {
		return "EmployeeEmails [id=" + id + ", email=" + email + "]";
	}
}
