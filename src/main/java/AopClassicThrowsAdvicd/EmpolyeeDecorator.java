package AopClassicThrowsAdvicd;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class EmpolyeeDecorator implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
        System.out.println("===================> this after thorwing start");
        System.out.println("this method is target : " + method.getName() +" ------- "+ target.getClass().getName());
        System.out.println("===================> this after thorwing start");
    }

}
