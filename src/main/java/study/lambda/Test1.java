package study.lambda;

import java.util.Arrays;

public class Test1 {
    public TestInterface ti;

    public Test1(TestInterface ti) {
        this.ti = ti;
    }
    public Test1(){

    }

    public static void main(String[] args) {
       String str = "Yang  Xu, .suzhou, jiangsu, , 0, Not shipped<br />Yang  Xu, .suzhou, jiangsu, , 0, Not shipped";
       String[] strs = str.split("<br />");
    }
    public  int tt(String a){
        System.out.println(777);
        ti.summer("1231");
        return 0;
    }

}
