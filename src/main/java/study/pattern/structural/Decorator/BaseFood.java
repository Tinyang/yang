package study.pattern.structural.Decorator;

public class BaseFood implements Food {
    @Override
    public String prepareFood() {
        return "this is base food!";
    }

    @Override
    public double getFoodPrice() {
        return 20.0;
    }

    public BaseFood() {
    }
}
