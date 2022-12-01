package AopClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var bean = context.getBean(Employee.class);
        bean.setName("kia");
        System.out.println(bean.getName());
    }
}
