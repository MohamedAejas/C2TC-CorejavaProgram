package entityclassassignment2;

public class Product {
		    private int id;
		    private String name;
		    private double price;
		    private int quantity;

		    // Constructor
		    public Product(int id, String name, double price, int quantity) {
		        this.id = id;
		        this.name = name;
		        this.price = price;
		        this.quantity = quantity;
		    }

		    // Method to display product details
		    public void displayProduct() {
		        System.out.println("Product ID: " + id);
		        System.out.println("Product Name: " + name);
		        System.out.println("Price: ₹" + price);
		        System.out.println("Quantity: " + quantity);
		        System.out.println("---------------------------");
	}

}
