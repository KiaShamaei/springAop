package AopClassicStaticWithPointcut;

public class JavaProgrammer implements Programmer {

    @Override
    public void mi() {
        System.out.println("this is from Java mi");
    }

    @Override
    public void md() {
        System.out.println("this is from java md");
    }
}
