package AopSpringExample;

import org.springframework.stereotype.Component;

@Component("service")
public class Service {
    private final Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }
    public String check() throws InterruptedException {
        return  dao.callDao();
    }
}
