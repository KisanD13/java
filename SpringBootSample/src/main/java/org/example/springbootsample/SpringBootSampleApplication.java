package org.example.springbootsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Laptop{
    public void compile(){
        System.out.println("compile");
    }
}

@Component
class Alien{

    @Autowired
    Laptop laptop;
    public void coding(){
//        System.out.println("Alien");
        laptop.compile();
    };
}

@SpringBootApplication
public class SpringBootSampleApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SpringBootSampleApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        alien.coding();

    }

}
