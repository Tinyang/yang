package study.io;

import study.algorithm.Sort;

import java.io.*;

public class StreamIO {
    public static void replaceFile(String fromAbsoultePath, String targetAbsoultePath){
        File targetFile = new File(targetAbsoultePath);
        //if(targetFile.exists()){
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                fileInputStream = new FileInputStream(fromAbsoultePath);
                fileOutputStream = new FileOutputStream(targetAbsoultePath);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fileInputStream.read(buffer)) > 0){
                    fileOutputStream.write(buffer,0,length);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
       /* }else {
            System.out.println(targetAbsoultePath + " isn't exist");
        }*/
    }

    public static void replaceFile2(String fromAbsoultePath, String targetAbsoultePath){
        File targetFile = new File(targetAbsoultePath);
        //if(targetFile.exists()){
        FileReader fileInputStream = null;
        FileWriter fileOutputStream = null;
        try {
            fileInputStream = new FileReader(fromAbsoultePath);
            fileOutputStream = new FileWriter(targetAbsoultePath);
            char[] buffer = new char[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0){
                fileOutputStream.write(buffer,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       /* }else {
            System.out.println(targetAbsoultePath + " isn't exist");
        }*/
    }

    public static void main(String[] args) {
        //replaceFile2("D:\\test.mp3","D:\\test1.mp3");
       // replaceFile2("D:\\ttt.doc","D:\\ttt1.doc");

        Object[] objects = new Object[10];
        System.out.println(9 >> 1);
    }
}
