package StaticProblems;

public class ShoppingCart {
    private static double discount = 10.0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public ShoppingCart(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public void displayProductDetails() {
        if (this instanceof ShoppingCart) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Price after discount: $" + discountedPrice);
        } else {
            System.out.println("Invalid product instance.");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        ShoppingCart prod1 = new ShoppingCart("PROD001", "Laptop", 1200.00, 2);
        ShoppingCart prod2 = new ShoppingCart("PROD002", "Headphones", 150.00, 5);

        System.out.println("\nProduct 1 Details:");
        prod1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        prod2.displayProductDetails();

        ShoppingCart.updateDiscount(15.0);

        System.out.println("\nProduct 1 Details After Discount Update:");
        prod1.displayProductDetails();
    }
}


