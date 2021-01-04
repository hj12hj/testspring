package intection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import resp.resppeople;

//依赖注入
public class intest {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("injection.xml");

//        resppeople rep = beanFactory.getBean("rsppeople", resppeople.class);

//        System.out.println(beanFactory.getBean(BeanFactory.class));
    }
}