package AopSpringExample;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class AspectSimple2 {
    @Pointcut("execution(* *..check(..))")
    public void trackCheck(){}
    @Before("trackCheck()")
    public void before2(){
        System.out.println("this is before 2 ... by order ...");
    }
}
