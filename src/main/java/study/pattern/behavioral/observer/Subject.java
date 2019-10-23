package study.pattern.behavioral.observer;

public interface Subject {

    void registerObserver(Observer observer);

    void reomoveObserver(Observer observer);

    void notifyObservers();
}
