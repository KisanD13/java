package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
     public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// creates container
        Alien obj = context.getBean("alien1", Alien.class);
        obj.code();
        // obj.setAge(20);
        System.out.println(obj.getAge());
        System.out.println(obj.getWeight());

        // Alien obj1 = (Alien) context.getBean("alien1", Alien.class); //object is
        // created one time but obj and obj1 is referring to that
        // System.out.println(obj1.getAge());

         Desktop desk = context.getBean(Desktop.class);
    }
}
