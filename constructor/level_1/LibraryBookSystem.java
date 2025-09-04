package Constructor.level_1;

public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean availability;

    public LibraryBookSystem(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            return true;
        } else {
            return false;
        }
    }
}


