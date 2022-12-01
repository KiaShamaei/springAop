package AopClassicDynamicWithPoiintcut;

public class JavaProgrammer implements Programmer {

    @Override
    public void mi() {
        System.out.println("this is from Java mi");
    }

    @Override
    public Integer md(Integer test) {

        System.out.println("this is from java md");
        return 12;
    }
}
