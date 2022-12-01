package AopClassicThrowsAdvicd;

public class Employee {
    private String name;

    public String getName() throws Exception {
        if(name != null)
        return name;
        throw new Exception("this is exception");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void error1() throws Exception {
        throw new Exception("this is from POJO");
    }
}
