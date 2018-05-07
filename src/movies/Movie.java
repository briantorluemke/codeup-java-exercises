package movies;
import movies.MoviesArray;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCat(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public String getCat() {
        return this.category;
    }
}