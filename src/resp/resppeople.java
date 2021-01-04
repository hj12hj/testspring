package resp;

import org.springframework.beans.factory.BeanFactory;
import pojo.People;

import java.util.Collection;

public class resppeople {

    private Collection<People> peoples;
    private BeanFactory beanFactory;

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public Collection<People> getPeoples() {
        return peoples;
    }

    public void setPeoples(Collection<People> peoples) {
        this.peoples = peoples;
    }

    @Override
    public String toString() {
        return "resppeople{" +
                "peoples=" + peoples +
                '}';
    }
}