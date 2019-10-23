package study.pattern.creational.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Early.getEarly() == Early.getEarly());
        System.out.println(Lazy.getLazy() == Lazy.getLazy());
    }
}
