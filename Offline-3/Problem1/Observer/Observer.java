package Observer;

import java.util.List;

public interface Observer {
    void notify(String movie, String genre);

    List<String> getFavoriteGenres();

    void removeFavoriteGenre(String genre);

    void addFavoriteGenre(String genre);
}
