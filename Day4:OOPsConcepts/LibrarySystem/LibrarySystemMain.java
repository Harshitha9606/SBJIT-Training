package Day4Excercise;

import java.util.Scanner;

public class LibrarySystemMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of book you want (TextBooks / Novels):");
        String choice = scanner.nextLine();

        LibrarySystem librarySystem; 

        if (choice.equalsIgnoreCase("TextBooks")) {
            librarySystem = new TextBook(scanner);
        } else if (choice.equalsIgnoreCase("Novels")) {
            librarySystem = new Novel(scanner);
        } else {
            System.out.println("Invalid book type selected.");
            scanner.close();
            return;
        }

        librarySystem.getBookType(); 

        scanner.close();
    }
}
