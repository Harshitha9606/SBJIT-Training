package Day5Excercise;

public class ProductPriceMain {
    public static void main(String[] args) {

        try {
            Product[] products = {
                new Product("Laptop", 75000),
                new Product("Mouse", 500),
                new Product("Keyboard", 1200),
                new Product("Mobile",-20000)
            };

            double total = ProductPriceCalculator.calculateTotal(products);
            System.out.println("Total Price: " + total);

        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
    }
}

