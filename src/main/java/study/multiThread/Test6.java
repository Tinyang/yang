package study.multiThread;

public class Test6 {
    public static void main(String[] args) {
        try {
            TestStudent testStudent = (TestStudent) Class.forName("study.multiThread.TestStudent").newInstance();
            testStudent.agePlus();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
