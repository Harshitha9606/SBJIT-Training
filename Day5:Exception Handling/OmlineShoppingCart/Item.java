package Day5Excercise;

public class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) throws InvalidQuantityException {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Invalid quantity for item: " + name);
        }
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
