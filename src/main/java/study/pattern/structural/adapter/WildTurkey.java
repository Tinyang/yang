package study.pattern.structural.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble gobble!!!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
