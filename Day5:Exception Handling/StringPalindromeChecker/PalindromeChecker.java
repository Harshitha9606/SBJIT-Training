package Day5Excercise;

public class PalindromeChecker {

    public static void checkPalindrome(String str)
            throws EmptyStringException {

        if (str == null || str.length() == 0) {
            throw new EmptyStringException("String is empty");
        }

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }

    public static void main(String[] args) {

        String input = "ma'am";  

        try {
            checkPalindrome(input);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
