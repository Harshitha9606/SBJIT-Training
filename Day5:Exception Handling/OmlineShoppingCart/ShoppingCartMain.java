package Day5Excercise;

public class ShoppingCartMain {
    public static void main(String[] args) {

        try {
            Item[] items = {
                new Item("Laptop", 1, 45000),
                new Item("Smartphone", 2, 8000),
                new Item("Headphones", 3, 1500)
            };

            double total = ShoppingCart.computeTotal(items);
            System.out.println("Total Bill: " + total);

            // Example with exceeding limit
            Item[] expensiveItems = {
                new Item("TV", 2, 30000)
            };
            double total2 = ShoppingCart.computeTotal(expensiveItems);
            System.out.println("Total Bill: " + total2);

        } catch (InvalidQuantityException | LimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
