package Q2;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
    // Feed is a concrete implementation of the Subject interface
    private final List<Observer> observers = new ArrayList<>();

    // Register an observer
    public void registerObserver(Observer o) {
        this.observers.add(o); // Add the observer to the list of observers
    }

    // Notify all observers
    public void notifyObservers(String tweet) {
        observers.forEach(o -> o.notify(tweet)); // Notify all observers
    }
}
