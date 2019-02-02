package study.Proxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void testProxy(){
        Hello hello = new HelloImp();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(hello);
        Hello proxyHello = (Hello) invocationHandler.newProxyInstance();
        proxyHello.sayHello("5555");
    }
}
