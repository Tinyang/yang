package study.pattern.observer;

public class ObserverTest {
    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.notifyObservers();
        subject.reomoveObserver(observer1);
        subject.notifyObservers();
    }

}
