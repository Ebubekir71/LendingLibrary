public class Book {
    private long id;
    private String title;
    private Author author;

    public Book(long id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
