package study.syntax;

public class Test1 {

    private static void testPlusPlus(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        int tempNum1 = 1;
        testPlusPlus(++tempNum1);//2
        testPlusPlus(tempNum1);//2
        int tempNum2 = 1;
        testPlusPlus(tempNum2++);//1
        testPlusPlus(tempNum2);//2
    }
}
