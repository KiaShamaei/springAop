package AopClassicBefore;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class EmployeeDecorator implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("this is from proxy  start..........");

        System.out.println("this method is target" + method.getName() +" ------- "+ target.getClass().getName());

        System.out.println("this si from proxy end.............");
    }
}
