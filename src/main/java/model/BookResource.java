package model;

public class BookResource {
    private Book book;

    public BookResource(){};

    public BookResource(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookResource{" +
                "book=" + book +
                "}\n";
    }
}
