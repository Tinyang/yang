package study.syntax;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LearningMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("map", "geeksforgeeks.org");
        map.put("Practice", "practice.geeksforgeeks.org");
        map.put("Code", "code.geeksforgeeks.org");
        map.put("Quiz", "quiz.geeksforgeeks.org");

        //support jdk1.5+
        /*for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ----- " + entry.getValue());
        }

        //not suggest ineffective, support jdk1.5+
        for(String key : map.keySet()) {
            System.out.println(key + "----" + map.get(key));
        }*/

        //the only method for jdk1.4
        /*Iterator<Map.Entry<String, String>> literator = map.entrySet().iterator();
        while (literator.hasNext()) {
            Map.Entry<String, String> entry = literator.next();
            System.out.println(entry.getKey() + "------" + entry.getValue());
        }*/
        //another write method for jdk1.4
        for(Iterator<Map.Entry<String, String>> literator = map.entrySet().iterator(); literator.hasNext();){
            Map.Entry<String, String> entry = literator.next();
            System.out.println(entry.getKey() + "------" + entry.getValue());
        }

        //jdk8
        //map.forEach((k,v) ->System.out.println(k + "------" + v));

    }


}
