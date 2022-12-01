package AopClassicAround;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HumanDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before call in proxy"); //before call in proxy
        Object invoke = invocation.proceed();//this is method call ...
        System.out.println("after calll in proxy");
        return invoke;
    }
}
