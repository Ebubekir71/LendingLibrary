public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ebubekir", "Tosun", "ebubekirtosun@gmail.com");
        Author author = new Author("Mike", "Anderson");
        Book book = new Book(123456789, "Deutsche Welle", author);
        Movie movie = new Movie(987654321, "Last Fight");
        Actor actor = new Actor("John", "Mikel");

        customer.lendBook(book);
        customer.lendMovie(movie);

        movie.addActor(actor);

        System.out.println(customer);
        System.out.println(book);
        System.out.println(movie);
        System.out.println(actor);


    }
}