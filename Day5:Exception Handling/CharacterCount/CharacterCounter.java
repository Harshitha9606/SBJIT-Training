package Day5Excercise;

public class CharacterCounter {

    public static int countCharacter(String str, char ch) throws NullStringException {
        if (str == null) {
            throw new NullStringException("String is null");
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Character '" + ch + "' not found in the string.");
        }

        return count;
    }
}
