package Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import pojo.People;

public class subconfig {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;


    @Bean("people")
    public People GetPeople() {
        People p = new People();
        p.setAge(age);
        p.setName(name);

        return p;
    }


}