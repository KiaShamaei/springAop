package AopClassicAfter;

import AopClassicBefore.Employe;
import org.springframework.aop.framework.ProxyFactory;

public class Test {
    public static void main(String[] args) {
        EmployeeDecoratorAfter empDoc = new EmployeeDecoratorAfter();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Employe());
        proxyFactory.addAdvice(empDoc);
        Employe employe=(Employe) proxyFactory.getProxy();
        employe.setName();
    }
}
