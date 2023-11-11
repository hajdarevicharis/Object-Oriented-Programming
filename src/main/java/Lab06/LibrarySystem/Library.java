package Lab06.LibrarySystem;

import java.util.ArrayList;



public class Library extends Book {
    ArrayList<Book> books = new ArrayList<>();

    public Library() {

    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(title)) {
                found.add(book);
            }
        }
        return found;
    }



    public String printBooks() {
        for (Book book : this.books) {
            System.out.println("Title: " + book.getBookName() + ", Publisher name: " + book.getPublisherName() + ", Publish year: " + book.getPublishYear());
        }
        return "";
    }
    public void addBook(Book book) {
        Book newBook = new Book(book.getBookName(), book.getPublisherName(), book.getPublishYear());
        books.add(newBook);
    }

    @Override
    public String toString() {
        return "Book library: " + "\nPublisher name: " + getPublisherName() + "\nBook name: " + getBookName() + "\nPublish year" + getPublishYear();
    }

    public String haki() {
        return getPublisherName();
    }
}
