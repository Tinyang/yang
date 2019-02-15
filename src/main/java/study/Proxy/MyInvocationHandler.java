package study.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    private Hello hello;

    public MyInvocationHandler(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===============before===============");
        Object object = method.invoke(hello,args);
        System.out.println("===============after===============");
        return object;
    }

    public Object newProxyInstance(){
        return Proxy.newProxyInstance(hello.getClass().getClassLoader(),hello.getClass().getInterfaces(),this);
    }
}
