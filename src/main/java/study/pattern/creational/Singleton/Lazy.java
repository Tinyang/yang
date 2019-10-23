package study.pattern.creational.Singleton;

public class Lazy {
    private static Lazy lazy;

    private Lazy() {
    }

    public static Lazy getLazy() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
