package Day5Excercise;

public class ProductPriceCalculator {

    public static double calculateTotal(Product[] products)
            throws InvalidPriceException {

        double total = 0;

        for (Product p : products) {
            if (p.getPrice() < 0) {
                throw new InvalidPriceException(
                    "Negative price found for product: " + p.getName()
                );
            }
            total += p.getPrice();
        }
        return total;
    }
}
