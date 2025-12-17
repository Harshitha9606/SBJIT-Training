package Day7Excercise;

public class BookInventory {
	
	private int id;
	private String title;
	private double price;
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookInventory(int id, String title, double price, String author) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookInventory [id=" + id + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
	
}
