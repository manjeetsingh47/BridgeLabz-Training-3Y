package Constructor.AccessModifier;

public class BookLibrarySystem {
    public String ISBN;
    protected String title;
    private String author;

    public BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends BookLibrarySystem {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
       
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
       
        System.out.println("Author: " + getAuthor());
    }

    public void changeTitle(String newTitle) {
        this.title = newTitle; 
    }
}

class Main {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch");
        ebook.displayEBookDetails();

        ebook.changeTitle("Effective Java - 3rd Edition");
        ebook.setAuthor("Joshua J. Bloch");

        System.out.println("\nAfter updates:");
        ebook.displayEBookDetails();
    }
}

