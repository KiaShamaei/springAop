package AopSpringXml;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AuditAvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("this is from Avice method name " + method.getName());
    }
}
