package Day5Excercise;

public class RegistrationForm {

    public static void validateUsername(String username)
            throws InvalidUsernameException {

        if (username.contains(" ") || username.length() < 5) {
            throw new InvalidUsernameException(
                "Invalid username: must be at least 5 characters and contain no spaces"
            );
        }

        System.out.println("Registration successful");
    }

    public static void main(String[] args) {

        String username = "Mamatha_S";   

        try {
            validateUsername(username);
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        }
    }
}
