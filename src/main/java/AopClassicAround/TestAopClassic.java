package AopClassicAround;

import org.springframework.aop.framework.ProxyFactory;

public class TestAopClassic {
    public static void main(String[] args) {
        Human human = new Human();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new HumanDecorator());
        proxyFactory.setTarget(human);

        var proxy =(Human) proxyFactory.getProxy();

//        proxy.speak(); both method from proxy can call
        proxy.learn();

//        human.speak();

    }
}
