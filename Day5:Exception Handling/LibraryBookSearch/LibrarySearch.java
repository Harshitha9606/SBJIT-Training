package Day5Excercise;

public class LibrarySearch {

    public static Book searchBookByTitle(Book[] books, String searchTitle)
            throws BookNotFoundException {

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(searchTitle)) {
                return b;
            }
        }
        throw new BookNotFoundException("Book with title '" + searchTitle + "' not found.");
    }

    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book(1, "Java Basics");
        books[1] = new Book(2, "Python Programming");
        books[2] = new Book(3, "Data Structures");
        books[3] = new Book(4, "Java Full Stack Development");

        String titleToSearch = "Java Full Stack Development";

        try {
            Book foundBook = searchBookByTitle(books, titleToSearch);
            System.out.println("Book Found:");
            foundBook.display();
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
