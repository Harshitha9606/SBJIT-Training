package Day5Excercise;

public class ShoppingCart {

    public static double computeTotal(Item[] items) throws LimitExceededException {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }

        if (total > 50000) {
            throw new LimitExceededException("Total bill exceeds the allowed limit of 50,000");
        }

        return total;
    }
}
