package AopSpringAnnotationAspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class SimpleAdvice {


    @Before("execution(* AopSpringAnnotationAspectj.JavaProgrammer.amghezi(..))")
    public void simplePointCut(JoinPoint joinPoint){
        System.out.println("this is from simple advice : " + joinPoint.getSignature().getName());
    }
    @Around("AopSpringAnnotationAspectj.PointcutConfig.forDao()")
    public void simplePointcut(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("this is from point declartion ==============> start");
        joinPoint.proceed();
        System.out.println("this is from point declartion ==============> start");
    }

    //this can get ProccessingJoinpoint if advice be around
    @Around("execution(public * *..amghezi(..))")
    public void simplePointCutGetProcessingJoinpoint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before call target method ======>");
        joinPoint.proceed();
        System.out.println("after call target method ======>");

    }

    @AfterReturning(value = "execution(* *..m1(..))",returning ="result")
    public void findResult(Object result){
        System.out.println("hora result from advice  ..." +  result);
    }
}
