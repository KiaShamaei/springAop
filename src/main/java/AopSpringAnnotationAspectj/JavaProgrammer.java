package AopSpringAnnotationAspectj;

import org.springframework.stereotype.Component;

@Component("JavaProgrammer")
public class JavaProgrammer {
    public void code1(){
        System.out.println("this is from code1");
    }
    public String m1(){
        return "this return part";
    }
    public void amghezi(){
        System.out.println("this is from amgexi");
    }

}
