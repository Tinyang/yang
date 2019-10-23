package study.pattern.structural.Decorator;

public class ChineseFood extends FoodDecorator {
    public ChineseFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return getBaseFood().prepareFood() + " this is chinese food";
    }

    @Override
    public double getFoodPrice() {
        return getBaseFood().getFoodPrice() + 50.0;
    }
}
