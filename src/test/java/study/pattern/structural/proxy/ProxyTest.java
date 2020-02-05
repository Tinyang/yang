package study.pattern.structural.proxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class ProxyTest {

    public void testProxy(){
        Hello hello = new HelloImp();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(hello);
        Hello proxyHello = (Hello) invocationHandler.newProxyInstance();
        proxyHello.sayHello("5555");
    }

    public void testCglibProxy(){
        CglibProxy proxy = new CglibProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Hello.class);
        enhancer.setCallback(proxy);

        Hello hello = (Hello)enhancer.create();
        hello.sayHello("666");
    }
}
