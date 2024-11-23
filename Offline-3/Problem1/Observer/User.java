package Observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private String name;
    private List<String> favoriteGenres;

    public User(String name) {
        this.name = name;
        this.favoriteGenres = new ArrayList<>();
    }

    @Override
    public void addFavoriteGenre(String genre) {
        favoriteGenres.add(genre);
    }

    @Override
    public void removeFavoriteGenre(String genre) {
        favoriteGenres.remove(genre);
    }

    public String getName() {
        return name;
    }

    @Override
    public void notify(String movie, String genre) {
        if (favoriteGenres.contains(genre)) {
            System.out.println(name + " is notified about the new " + genre + " movie " + movie);
        }
    }

    @Override
    public List<String> getFavoriteGenres() {
        return favoriteGenres;
    }
}
