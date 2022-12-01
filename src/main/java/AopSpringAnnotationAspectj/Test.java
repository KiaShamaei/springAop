package AopSpringAnnotationAspectj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
//        var bean = (Office)context.getBean("Office");
//        bean.check();
        var bean = (JavaProgrammer)context.getBean("JavaProgrammer");
       var result=  bean.m1();
        System.out.println(result);
//        var bean = context.getBean(SimpleAdvice.class);
//        System.out.println(bean);


    }
}
