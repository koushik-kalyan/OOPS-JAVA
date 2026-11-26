class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
 
    private static int totalBooks = 0;
 
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }
 
    void display() {
        System.out.println("ID: " + bookId + "\nTitle: " + title +
                           "\nAuthor: " + author + "\nPrice: Rs. " + price + "\n");
    }
 
    static Book search(Book[] books, int id) {
        for (Book b : books) {
            if (b.bookId == id) {
                return b;
            }
        }
        return null;
    }
 
    static Book search(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
 
    Book costlier(Book other) {
        if (this.price >= other.price) {
            return this;
        } else {
            return other;
        }
    }
 
    static int getTotalBooks() {
        return totalBooks;
    }
}
 
public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book(1, "The Alchemist", "Paulo Coelho", 350.0);
        Book b2 = new Book(2, "Wings of Fire", "A.P.J. Abdul Kalam", 275.5);
        Book b3 = new Book(3, "Clean Code", "Robert C. Martin", 899.0);
        Book b4 = new Book(4, "Let Us C", "Yashavant Kanetkar", 420.0);
 
        Book[] library = {b1, b2, b3, b4};
 
        System.out.println("-- All Books --");
        for (Book b : library) {
            b.display();
        }
 
        System.out.println("\nSearch by ID:");
        Book r1 = Book.search(library, 3);
        if (r1 != null) r1.display(); else System.out.println("Book not found");
 
        System.out.println("\nSearch by Title:");
        Book r2 = Book.search(library, "Wings of Fire");
        if (r2 != null) r2.display(); else System.out.println("Book not found");
 
        System.out.println("\nSearch by ID:");
        Book r3 = Book.search(library, 10);
        if (r3 != null) r3.display(); else System.out.println("Book not found");
 
        System.out.println("\nCostlier of b1 and b4:");
        b1.costlier(b4).display();
 
        System.out.println("\nCostlier of b2 and b3:");
        b2.costlier(b3).display();
 
        System.out.println("\nTotal number of books: " + Book.getTotalBooks());

        System.out.println("\nKoushik kalyan N\n1WN25CS112");
    }
}
