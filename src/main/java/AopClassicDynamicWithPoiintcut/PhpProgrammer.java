package AopClassicDynamicWithPoiintcut;

public class PhpProgrammer implements Programmer {
    @Override
    public void mi() {
        System.out.println("this is from php mi");
    }
    @Override
    public Integer md(Integer test) {
        System.out.println("this is from php md");
        return 10;
    }

}
