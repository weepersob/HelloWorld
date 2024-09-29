public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int year;

    public Book(String title, String author, String ISBN, int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

}
