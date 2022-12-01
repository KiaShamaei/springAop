package AopSpringExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var bean = context.getBean(Service.class);
        bean.check();
    }
}
