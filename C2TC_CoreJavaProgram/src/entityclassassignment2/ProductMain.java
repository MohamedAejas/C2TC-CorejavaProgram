package entityclassassignment2;
import java.util.Scanner;
public class ProductMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[4];

        System.out.println("Enter details of 4 products:");

        for (int i = 0; i < 4; i++) {
            System.out.println("Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(id, name, price, quantity);
            System.out.println();
        }

        System.out.println("Displaying Product Details:");
        for (Product p : products) {
            p.displayProduct();
        }

        scanner.close();
	}

}
