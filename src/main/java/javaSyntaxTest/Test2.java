package javaSyntaxTest;

import java.util.ArrayList;
import java.util.HashMap;

public class Test2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5 ; i++) {
            HashMap map = new HashMap();
            map.put(i,i);
            list.add(map);
        }
        System.out.println("end");
    }
}
