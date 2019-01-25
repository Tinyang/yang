package study.lambda;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        //(parameters) -> expression
        //(parameters) ->{ statements; }

        Arrays.asList("a","b","c").forEach(o-> System.out.println(o));

        Arrays.asList("a","b","c").sort((String a1,String b2)-> a1.compareTo(b2));

        //Arrays.asList("a","b","c").forEach();
    }
}
