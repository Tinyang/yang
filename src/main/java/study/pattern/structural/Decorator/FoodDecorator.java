package study.pattern.structural.Decorator;

public abstract class FoodDecorator implements Food {

    private Food baseFood;

    public FoodDecorator(Food food){
        baseFood = food;
    }

    public Food getBaseFood() {
        return baseFood;
    }

    public void setBaseFood(Food baseFood) {
        baseFood = baseFood;
    }

}
