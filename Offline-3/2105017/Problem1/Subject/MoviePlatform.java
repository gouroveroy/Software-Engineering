package Subject;

import Observer.Observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.ArrayList;

public class MoviePlatform implements Subject {
    private List<Observer> observers;
    private ExecutorService executorsService;
    public List<String> genres;

    public MoviePlatform() {
        this.observers = new ArrayList<Observer>();
        this.executorsService = Executors.newCachedThreadPool();
        this.genres = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String movie, String genre) {
        for (Observer observer : observers) {
            if (observer.getFavoriteGenres().contains(genre)) {
                // new Thread(() -> observer.notify(movie, genre)).start();
                executorsService.execute(() -> observer.notify(movie, genre));
            }
        }
    }

    @Override
    public void addGenre(String genre) {
        genres.add(genre);
    }

    @Override
    public void removeGenre(String genre) {
        genres.remove(genre);
        System.out.println("The genre " + genre + " is no longer available on the platform");
        for (Observer observer : observers) {
            if (observer.getFavoriteGenres().contains(genre)) {
                observer.removeFavoriteGenre(genre);
            }
        }
    }

    public void uploadMovie(String movie, String genre) {
        if (!genres.contains(genre)) {
            System.out.println("The genre " + genre + " is not available on the platform");
            return;
        }
        notifyObservers(movie, genre);
    }

    public void close() {
        executorsService.shutdown();
    }
}
