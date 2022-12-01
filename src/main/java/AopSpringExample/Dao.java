package AopSpringExample;

import org.springframework.stereotype.Component;

@Component("dao")
public class Dao {
    public String callDao() throws InterruptedException {
        Thread.sleep(10000);
        return "this is method call";
    }

}
