package Constructor.Instance_Variables;

public class ProductInventory {
    String productName;
    double price;
    static int totalProducts = 0;

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 1200.00);
        ProductInventory p2 = new ProductInventory("Phone", 800.00);
        ProductInventory p3 = new ProductInventory("Headphones", 150.00);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        ProductInventory.displayTotalProducts();
    }
}





