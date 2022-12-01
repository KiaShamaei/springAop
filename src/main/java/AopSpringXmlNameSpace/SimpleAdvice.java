package AopSpringXmlNameSpace;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class SimpleAdvice {
    public void simplePointCut(JoinPoint joinPoint){
        System.out.println("this is from simple advice : " + joinPoint.getSignature().getName());
    }
    //this can get ProccessingJoinpoint if advice be around
    public void simplePointCutGetProcessingJoinpoint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before call target method ======>");
        joinPoint.proceed();
        System.out.println("after call target method ======>");

    }
}
