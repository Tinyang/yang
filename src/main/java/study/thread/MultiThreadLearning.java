package study.thread;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MultiThreadLearning {

    private List allFile = new ArrayList<String>();

    public List<String> getAllFile(String path) {
        File f = new File(path);
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                String directoryPath = file.getPath();
                getAllFile(directoryPath);
            } else {
                String filePath = file.getPath();
                if (!filePath.endsWith(".txt")) {
                    continue;
                }
                allFile.add(filePath);
            }
        }
        return allFile;
    }

    public static void main(String[] args) {

        List allFile2 = new MultiThreadLearning().getAllFile("D:\\Java_Software");

    }

}
