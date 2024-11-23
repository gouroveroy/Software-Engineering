package Subject;

import Observer.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String movie, String genre);

    void addGenre(String genre);

    void removeGenre(String genre);
}
