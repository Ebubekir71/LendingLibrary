import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<Movie> borrowedMovies = new ArrayList<>();

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    public void lendBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(firstName + " lends book " + book.getTitle());
    }
    public void lendMovie(Movie movie) {
        borrowedMovies.add(movie);
        System.out.println(firstName + " lends movie " + movie.getTitle());
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public ArrayList<Movie> getBorrowedMovies() {
        return borrowedMovies;
    }

    @Override
    public String toString() {
        return "Customer {" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
