package study.pattern.structural.proxy;

public class StaticProxiedHello implements Hello {

    private Hello hello = new HelloImp();

    @Override
    public String sayHello(String str) {
        return hello.sayHello(str);
    }
}
