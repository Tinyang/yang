package study.syntax;

import java.io.File;
import java.io.IOException;

public class Test6 {

    public static void main(String[] args) {
        File file = new File("D:\\testnew\\test22\\test33\\test44\\test333\\test");
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
