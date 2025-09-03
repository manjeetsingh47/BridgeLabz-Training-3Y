package oops.level_2;


import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String itemName, double price, int quantity) {
        for (CartItem item : items) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                item.quantity += quantity;
                return;
            }
        }
        items.add(new CartItem(itemName, price, quantity));
    }

    void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
    }

    double getTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Shopping cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (CartItem item : items) {
            System.out.println(item.itemName + " - $" + item.price + " x " + item.quantity + " = $" + item.getTotalPrice());
        }
        System.out.println("Total Cost: $" + getTotalCost());
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 0.99, 5);
        cart.addItem("Milk", 2.49, 2);
        cart.addItem("Bread", 3.0, 1);
        cart.displayCart();

        cart.removeItem("Milk");
        cart.displayCart();
    }
}


