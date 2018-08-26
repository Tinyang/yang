package study.pattern.adapter;

public class DuckAdapter implements Turkey {

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble()66666 {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
