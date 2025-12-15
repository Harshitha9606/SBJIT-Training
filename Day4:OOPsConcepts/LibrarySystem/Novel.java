package Day4Excercise;

import java.util.Scanner;

public class Novel extends LibrarySystem {

    private Scanner scanner;

    public Novel(Scanner sc) {
        this.scanner = sc;
    }

    public void getBookType() {
        String[] novels = {
            "Malgudi Days",
            "The God of Small Things",
            "Ghachar Ghochar",
            "Harry Potter and the Philosopher’s Stone",
            "Life of Pi"
        };

        System.out.println("Enter the Novel you want:");
        for (String n : novels) {
            System.out.println(n);
        }

        String novelBook = scanner.nextLine();
        System.out.println("The Novel you've selected is: " + novelBook);
    }
}
