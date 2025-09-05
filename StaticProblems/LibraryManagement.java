package StaticProblems;

public class LibraryManagement {
    private static String libraryName = "City Central Library";

    private final String isbn;
    private String title;
    private String author;

    public LibraryManagement(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof LibraryManagement) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book instance.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
       LibraryManagement book1 = new LibraryManagement("The Great Gatsby", "F. Scott Fitzgerald", "ISBN001");
        LibraryManagement book2 = new LibraryManagement("To Kill a Mockingbird", "Harper Lee", "ISBN002");

        LibraryManagement.displayLibraryName();

        System.out.println("\nBook 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
    }
}


