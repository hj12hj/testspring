package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ListPeo {

//    @Autowired
//    @Qualifier("people")
    @Resource(name = "people")
    private People p;

    public People getPeople() {
        return p;
    }

    public void setPeople(People people) {
        this.p = people;
    }

    @Override
    public String toString() {
        return "ListPeo{" +
                "people=" + p +
                '}';
    }
}