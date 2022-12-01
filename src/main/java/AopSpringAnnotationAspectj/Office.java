package AopSpringAnnotationAspectj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Office")
@Qualifier("Office")
public class Office {
    JavaProgrammer javaProgrammer;
@Autowired
    public void setJavaProgrammer(JavaProgrammer javaProgrammer) {
        this.javaProgrammer = javaProgrammer;
    }
    public void excu(){
        javaProgrammer.code1();
        javaProgrammer.amghezi();
    }

    public void check(){
        javaProgrammer.amghezi();
    }

}
