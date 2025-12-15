package Day5Excercise;

class Book {

    int id;
    String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Book Title: " + title);
    }
}
