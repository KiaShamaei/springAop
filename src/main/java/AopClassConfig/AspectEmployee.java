package AopClassConfig;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectEmployee {
    @After("execution(*  *getName(..))")
    public void getCallAspect(JoinPoint joinPoint){
        System.out.println("this is call from aspect ... getname" + joinPoint.getSignature());
    }
}
