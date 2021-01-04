package Test;

import pojo.People;

import java.lang.reflect.Method;

public class test1 {

    public static void hhh(Class<?> T)
    {

        Method[]f = T.getMethods();
        for (Method f1:f
             ) {
            System.out.println(f1.getName());

        }

    }


    public static void main(String[] args) {

        hhh(People.class);




    }


}