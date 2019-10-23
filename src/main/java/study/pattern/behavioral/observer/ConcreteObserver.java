package study.pattern.behavioral.observer;

public class ConcreteObserver implements Observer {

    public  static int num = 1;
    @Override
    public void update() {
        num++;
        System.out.println("number is " + num);
    }
}
