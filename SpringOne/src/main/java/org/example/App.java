package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//creates container
        Alien obj = (Alien) context.getBean("alien1", Alien.class);
        obj.code();
        obj.age = 20;
        System.out.println(obj.age);

        Alien obj1 = (Alien) context.getBean("alien1", Alien.class); //object is created one time  but obj and obj1 is referring to that
        obj1.code();
        System.out.println(obj1.age);

    }
}
