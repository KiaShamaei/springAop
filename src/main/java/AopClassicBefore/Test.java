package AopClassicBefore;

import org.springframework.aop.framework.ProxyFactory;

public class Test {
    public static void main(String[] args) {
        EmployeeDecorator employeeDecorator = new EmployeeDecorator();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Employe());
        proxyFactory.addAdvice(employeeDecorator);
        //get Empolyeee proxy
        Employe empProxy = (Employe) proxyFactory.getProxy();
        empProxy.setName();
    }
}
