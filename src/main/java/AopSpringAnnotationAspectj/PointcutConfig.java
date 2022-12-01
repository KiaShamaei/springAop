package AopSpringAnnotationAspectj;


import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class PointcutConfig {

    @Pointcut("execution(* AopSpringAnnotationAspectj.JavaProgrammer.m1(..))")
    public void forDao() {

    }
}
