package Day5Excercise;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException(
                "Invalid price for product: " + name
            );
        }
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
