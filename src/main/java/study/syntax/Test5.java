package study.syntax;

public class Test5 {

    public void test(String str){
        System.out.println(Long.parseLong(str));

        String str1 = null;
    }

    public static void main(String[] args) {
        new Test5().test(null);
    }
}
