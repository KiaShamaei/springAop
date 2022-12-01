package AopClassicStaticWithPointcut;

public class PhpProgrammer implements Programmer{
    @Override
    public void mi() {
        System.out.println("this is from php mi");
    }
    @Override
    public void md() {
        System.out.println("this is from php md");
    }

}
