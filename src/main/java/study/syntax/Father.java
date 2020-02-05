package study.syntax;

public class Father {

    private String name = "father";

    private void printName(){
        System.out.println("Father.printName");
        System.out.println(name);
    }

    public void setName(String name2) {
        name = name2;
    }

    public static void main(String[] args) {
        Child child = new Child();
        //child.printName();
        child.setName("111");

        Father child2 = new Child();
        child2.printName();
        child2.setName("222");
    }
}
