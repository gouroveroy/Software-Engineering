import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    String stockName;
    double price;
    List<Observer> observers;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        observers = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
