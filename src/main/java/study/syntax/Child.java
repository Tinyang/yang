package study.syntax;

public class Child extends Father {
    private String name2 = "child";

   /* public void printName(){
        System.out.println("Child.printName");
    }*/
  public void setName(String name2) {
      name2 = name2;
  }

    public static void main(String[] args) {
        Father father = new Child();
        father.printName();
    }
}
