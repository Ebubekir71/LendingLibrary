import java.util.ArrayList;

public class Movie {
    private long id;
    private String title;

    private ArrayList<Actor> actors = new ArrayList<>();

    public Movie(long id, String title) {
        this.id = id;
        this.title = title;
    }
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void addActor(Actor actor) {
        actors.add(actor);
        System.out.println(actor.getFirstName() + " " + actor.getLastName() + " added to movies : " +title);
    }

    public ArrayList<Actor> getActors() {
        return new ArrayList<>(actors);
    }

    @Override
    public String toString() {
        return "Movie{id=" + id + ", title='" + title + "', actors=" + actors.toString().replace("[", "").replace("]", "") + "}";
    }

}
