package Test;

import annoce.Super;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.People;

import java.util.Map;

public class test {

    public static void main(String[] args) {

        BeanFactory fac = new ClassPathXmlApplicationContext("applicationcontext.xml");

        lookupByAnnotation(fac);


//        if (fac instanceof ListableBeanFactory)
//        {
//            ListableBeanFactory lb = (ListableBeanFactory) fac;
//
//            Map<String,People> Peoples = lb.getBeansOfType(People.class);
//
//            System.out.println(Peoples);
//        }
    }

    private static void lookupByAnnotation(BeanFactory fac) {
        if (fac instanceof ListableBeanFactory)
        {
            ListableBeanFactory lb = (ListableBeanFactory) fac;

            Map<String,People> Peoples = (Map)lb.getBeansWithAnnotation(Super.class);

            System.out.println(Peoples);
        }
    }

}
