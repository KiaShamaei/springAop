package AopClassicStaticWithPointcut;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Test {
    public static void main(String[] args) {
        PhpProgrammer php = new PhpProgrammer();
        JavaProgrammer java = new JavaProgrammer();
        Advisor advisor = new DefaultPointcutAdvisor(new ProgrammerPointCut(),new ProgrammerAdvice());
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(php);
        ProxyFactory proxyFactory2 = new ProxyFactory();
        proxyFactory2.addAdvisor(advisor);
        proxyFactory2.setTarget(java);
        var proxy1 = (PhpProgrammer) proxyFactory.getProxy();
        var proxy2 =(JavaProgrammer) proxyFactory2.getProxy();
        proxy2.mi();
        proxy1.mi();
    }
}
