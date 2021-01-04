package Test;



import Config.spconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.People;



public class test {


    @Test
    public void show() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(spconfig.class);

        People sp = ac.getBean("people", People.class);

        System.out.println(sp.toString());
    }


}
