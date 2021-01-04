package Test;



import Config.spconfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.People;



public class test {

    private ApplicationContext ac;
    private People sp;

    @Before
    public void init()
    {
         ac = new AnnotationConfigApplicationContext(spconfig.class);
       // System.out.println("init...");
    }

    @Test
    public void show() {


         sp= ac.getBean("people", People.class);

         System.out.println(sp.toString());
    }


}
