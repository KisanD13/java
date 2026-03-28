package org.example;

import org.example.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

//        Desktop desk = context.getBean("desktop", Desktop.class);
//        desk.compile();
//        Desktop desk1 = context.getBean("desktop", Desktop.class);
//        desk.compile();


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// creates container
//        Alien obj = context.getBean("alien1", Alien.class);
//        obj.code();
        // obj.setAge(20);
//        System.out.println(obj.getAge());
//        System.out.println(obj.getWeight());
        // Alien obj1 = (Alien) context.getBean("alien1", Alien.class); //object is
        // created one time but obj and obj1 is referring to that
        // System.out.println(obj1.getAge());
//         Desktop desk = context.getBean(Desktop.class);
    }
}
