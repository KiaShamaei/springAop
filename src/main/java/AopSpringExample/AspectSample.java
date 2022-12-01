package AopSpringExample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
@Order(2)
public class AspectSample {
    @Pointcut("execution(* *..check(..))")
    public void trackCheck(){}

    StopWatch watch = new StopWatch();

    @Before("trackCheck()")
    public void before1(){
        System.out.println("this is before 1 ... by order ...");
    }



    @Around("trackCheck()")
    public void getCheckMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("this is from advice start=>>>>>>>>>");
        watch.start();
        var result = joinPoint.proceed();
        System.out.println(result);
        watch.stop();
        System.out.println("this is the end in advice =>>>>>>>>>>>" +  watch.getTotalTimeMillis()/1000);

    }

}
