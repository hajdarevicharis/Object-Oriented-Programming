package Lab06.LibrarySystem;

public class Book {
    private String bookName, publisherName;
    private int publishYear;

    public Book(String bookName, String publisherName, int publishYear) {
        this.bookName = bookName;
        this.publisherName = publisherName;
        this.publishYear = publishYear;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "bookName='" + bookName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publishYear=" + publishYear;
    }
}
