package AopClassicDynamicWithPoiintcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ProgrammerAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("this is from advice ------------>");
       var n= invocation.proceed();
        System.out.println("this is from advice -----------------end>");
        return n;
    }
}
