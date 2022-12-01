package AopSpringXmlNameSpace;

public class Office {
    JavaProgrammer javaProgrammer;

    public void setJavaProgrammer(JavaProgrammer javaProgrammer) {
        this.javaProgrammer = javaProgrammer;
    }
    public void excu(){
        javaProgrammer.code1();
        javaProgrammer.amghezi();
    }
}
