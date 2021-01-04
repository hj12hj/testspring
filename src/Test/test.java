package Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.SuperPeople;

import java.util.Map;

public class test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Beanann.xml");

        SuperPeople sp = ac.getBean("sp",SuperPeople.class);

        System.out.println(sp.toString());

    }



}
