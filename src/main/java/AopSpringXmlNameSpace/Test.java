package AopSpringXmlNameSpace;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        var context = new ClassPathXmlApplicationContext();
        var context = new GenericXmlApplicationContext("file:D:\\SPRING\\AoP\\src\\main\\java\\AopSpringXmlNameSpace\\config.xml");
//        new XmlBeanDefinitionReader(context).loadBeanDefinitions("D:\\SPRING\\AoP\\src\\main\\java\\AopSpringXml\\config.xml");
        var bean = (Office) context.getBean("office");
        bean.excu();
    }
}
