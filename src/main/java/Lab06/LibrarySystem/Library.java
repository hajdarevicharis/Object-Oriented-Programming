package Lab06.LibrarySystem;
import java.util.ArrayList;
import Lab06.LibrarySystem.StringUtils;


public class Library extends Book {
    ArrayList<Book> books = new ArrayList<>();

    public Library() {

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

   public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> returnList = new ArrayList<>();

        for(Book book : books) {
            if(StringUtils.included(book.getPublisherName(), publisher)) {
                returnList.add(book);
            }
        }
        return returnList;
   }

   public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> returnList = new ArrayList<>();

        for(Book book : books) {
            if(StringUtils.included(book.getBookName(), title)) {
                returnList.add(book);
            }
        }
        return returnList;
   }

   public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> returnList = new ArrayList<>();

        for(Book book : books) {
            if(book.getPublishYear() == year) {
                returnList.add(book);
            }
        }
        return returnList;
   }
}
