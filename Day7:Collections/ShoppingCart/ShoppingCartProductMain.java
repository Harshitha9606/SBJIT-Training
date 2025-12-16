package Day7Excercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShoppingCartProductMain {

    public static void main(String[] args) {

        ArrayList<ShoppingCartProduct> products = new ArrayList<>();

        products.add(new ShoppingCartProduct(11, "Laptop", 50000));
        products.add(new ShoppingCartProduct(12, "Mobile", 20000));
        products.add(new ShoppingCartProduct(13, "Tablet", 25000));
        products.add(new ShoppingCartProduct(14, "Charger", 700));
        products.add(new ShoppingCartProduct(15, "IronBox", 2000));
        products.add(new ShoppingCartProduct(16, "EarPods", 1800));

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Products in Cart:");
        for (ShoppingCartProduct p : products) {
            System.out.println(p);
        }

        double totalBill = 0;
        for (ShoppingCartProduct p : products) {
            totalBill += p.getPrice();
        }
        System.out.println("\n Total Bill: ₹" + totalBill);

        System.out.print("\nEnter Product ID to remove: ");
        int removeId = scanner.nextInt();

        boolean removed = false;
        Iterator<ShoppingCartProduct> iterator = products.iterator();

        while (iterator.hasNext()) {
            ShoppingCartProduct product = iterator.next();
            if (product.getId() == removeId) {
                iterator.remove();
                removed = true;
                System.out.println(" Product removed successfully");
                break;
            }
        }

        if (!removed) {
            System.out.println(" Product ID not found");
        }

        totalBill = 0;
        for (ShoppingCartProduct product : products) {
            totalBill += product.getPrice();
        }

        System.out.println("\n Updated Cart:");
        for (ShoppingCartProduct p : products) {
            System.out.println(p);
        }

        System.out.println("\n Updated Total Bill: ₹" + totalBill);

        scanner.close();
    }
}

