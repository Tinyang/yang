package study.proxy;

public class HelloImp implements Hello {
    @Override
    public String sayHello(String str) {
        System.out.println("Happy New Year! " + str);
        return "Happy New Year! " + str;
    }
}
