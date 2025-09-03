package oops.level_1;

class Item {
    
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(1001, "Notebook", 45.75);
        item.displayDetails();
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}


