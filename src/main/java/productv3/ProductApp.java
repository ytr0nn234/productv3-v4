package productv3;

import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Product Viewer");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();  // read the product code

            Product p = ProductDB.getProduct(productCode);

            // display output
            System.out.println();
            if (p != null) {
                System.out.println("Description: " + p.toString());
                System.out.println("Price:       " + p.getPriceFormatted());
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println();
            System.out.println("Product count: " + Product.getCount() + "\n");

            //if user want to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}