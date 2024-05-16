package Q2;

// Subject interface
public interface Subject { // Subject is an interface
    void registerObserver(Observer o); // registerObserver is a method that takes an Observer as an argument

    void notifyObservers(String tweet); // notifyObservers is a method that takes a string as an argument
}
