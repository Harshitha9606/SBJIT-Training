package Day7Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInventoryMain {

    private ArrayList<BookInventory> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBook() {
    	
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Book Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        books.add(new BookInventory(id, name, price,author));
        
        
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Book found.");
        } else {
            System.out.println("Books List:");
            for (BookInventory book : books) {
                System.out.println(book);
            }
        }
    }

    public void updatePrice() {
        System.out.print("Enter Book ID to update price: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (BookInventory book : books) {
            if (book.getId() == id) {
                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                book.setPrice(price);
                System.out.println("Price updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        boolean removed = books.removeIf(book -> book.getId() == id);
        if (removed) {
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("\n--- Book Inventory ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Update Book Price");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> updatePrice();
                case 4 -> deleteBook();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        BookInventoryMain book = new Day7Excercise.BookInventoryMain();
        book.menu();
    }
}
