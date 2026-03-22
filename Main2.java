import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.isbn.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        System.out.println("Books:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After Removal:");
        lib.displayBooks();
    }
}