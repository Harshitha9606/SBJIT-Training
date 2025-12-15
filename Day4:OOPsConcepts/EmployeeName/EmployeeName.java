package Day4Excercise;

public class EmployeeName {

    private String name;

    public EmployeeName(String name) {
        this.name = name;
    }

    public String reverseName() {
        return new StringBuilder(name).reverse().toString();
    }
}
