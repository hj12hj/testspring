package Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.ServerPeo;

import java.util.Map;

public class test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");

       ServerPeo sp = ac.getBean("serpeo",ServerPeo.class);

        System.out.println(sp.toString());

    }



}
