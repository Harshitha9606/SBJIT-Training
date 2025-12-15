package Day5Excercise;

public class CharacterCountMain {
    public static void main(String[] args) {

        String input = "Mamatha";
        char target = 'a';

        try {
            int count = CharacterCounter.countCharacter(input, target);
            if (count > 0) {
                System.out.println("Character '" + target + "' occurred " + count + " times.");
            }
        } catch (NullStringException e) {
            System.out.println(e.getMessage());
        }

        String nullString = null;
        try {
            CharacterCounter.countCharacter(nullString, 'a');
        } catch (NullStringException e) {
            System.out.println(e.getMessage());
        }

        try {
            CharacterCounter.countCharacter("Mamatha", 's');
        } catch (NullStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
