package Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.ListPeo;

import java.util.Map;

public class test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Beanann.xml");

        ListPeo sp = ac.getBean("listPeo",ListPeo.class);

        System.out.println(sp.toString());

    }



}
