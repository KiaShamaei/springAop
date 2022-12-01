package AopClassicAfter;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class EmployeeDecoratorAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("this is from proxy ----------->");
        System.out.println("this is from proxy" + method.getName());
        System.out.println("this is from proxy end ----------->");
    }
}
