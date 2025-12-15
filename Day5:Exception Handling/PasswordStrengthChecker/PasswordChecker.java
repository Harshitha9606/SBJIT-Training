package Day5Excercise;

public class PasswordChecker {

    public static void checkPasswordStrength(String password) throws WeakPasswordException {
        if (password == null) {
            throw new WeakPasswordException("Password cannot be null");
        }

        if (password.length() < 8) {
            throw new WeakPasswordException("Password must be at least 8 characters long");
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
        }

        if (!hasUpper || !hasLower || !hasDigit) {
            throw new WeakPasswordException(
                "Password must contain uppercase, lowercase, and a digit"
            );
        }

        System.out.println("Password is strong.");
    }
}
