package Day4Excercise;

public class EmployeeArrayName {

    private String name;

    public EmployeeArrayName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String reverseName() {
        return new StringBuilder(name).reverse().toString();
    }
}
