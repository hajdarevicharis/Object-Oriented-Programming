package Lab07.Task02;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Collectors;

record Book(String title, String author, int publishYear, boolean status) {
    @Override
    public String toString() {
        return "title - '" + title + '\'' +
                ", author - " + author + '\'' +
                ", publishYear- " + publishYear +
                ", status - " + status;
    }
}

class LibraryCatalog {
    private ArrayList<Book> catalog = new ArrayList<>();

    public LibraryCatalog(ArrayList<Book> bookList) {
        this.catalog = bookList;
    }

    public Optional<Book> checkAvailability(String title) {
        return catalog.stream().filter(book -> book.title().equals(title)).findFirst();
    }

    public Optional<Book> checkDetailsByAuthor(String author) {
        return catalog.stream().filter(book -> book.author().equals(author) && book.status()).findFirst();
    }

    public Optional<Book> updateAvailability(String title, boolean availability) {
        catalog.forEach(book -> {
            if(book.title().equals(title)) {
                Book newBook = new Book(book.title(), book.author(), book.publishYear(), availability);
                catalog.set(catalog.indexOf(book), newBook);
            }
        });
        return null;
    }

    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "catalog=" + catalog +
                '}';
    }
}

class task02 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Knjiga1", "Autor1", 2000, true),
                new Book("Knjiga2", "Autor2", 2002, true),
                new Book("Knjiga3", "Autor3", 2004, false)
        ));

        LibraryCatalog libraryCatalog = new LibraryCatalog(books);



        libraryCatalog.updateAvailability("Autor1", false);
        Optional<Book> myBook = libraryCatalog.updateAvailability("Autor1", false);
        System.out.println(books.stream().filter(book -> !book.status()).collect(Collectors.toList()));
    }
}
