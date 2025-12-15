package Day5Excercise;

public class PasswordCheckerMain {
	
    public static void main(String[] args) {
        String[] passwords = {
            "Password123",   
            "password",      
            "PASSWORD123",   
            "Pass1",        
            null             
        };

        for (String pwd : passwords) {
            try {
                System.out.println("Checking password: " + pwd);
                PasswordChecker.checkPasswordStrength(pwd);
            } catch (WeakPasswordException e) {
                System.out.println("Weak password: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
