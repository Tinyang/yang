package study.pattern.structural.Decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Food food = new BaseFood();
        FoodDecorator foodDecorator = new ChineseFood(food);
        System.out.println(foodDecorator.prepareFood());
        System.out.println(foodDecorator.getFoodPrice());

    }
}
