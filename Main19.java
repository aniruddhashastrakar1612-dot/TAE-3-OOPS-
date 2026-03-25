class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class Main19 {
    public static void main(String[] args) {

        // Array of Book objects
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "James Gosling", 300);
        books[1] = new Book("Python Guide", "Guido", 400);
        books[2] = new Book("C Programming", "Dennis Ritchie", 250);

        // Display all books
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}