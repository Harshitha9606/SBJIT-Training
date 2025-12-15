package Day4Excercise;

import java.util.Scanner;

public class TextBook extends LibrarySystem {

    private Scanner scanner;

    public TextBook(Scanner sc) {
        this.scanner = sc;
    }
    
    public void getBookType() {
        String[] textBooks = {"Kannada","English","Mathematics","Science","Social Science"};

        System.out.println("Enter the subject Textbook you want:");
        for (String t : textBooks) {
            System.out.println(t);
        }

        String textBook = scanner.nextLine();
        System.out.println("The TextBook you've selected is: " + textBook);
    }
}
