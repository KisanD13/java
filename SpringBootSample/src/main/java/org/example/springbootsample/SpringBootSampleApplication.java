package org.example.springbootsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class Laptop implements Computer {
    public void compile() {
        System.out.println("Laptop compile");
    }
}

@Component
@Primary
class Desktop implements Computer {
    public void compile() {
        System.out.println("Desktop compile");
    }
}

@Component
class Alien {
    @Value("24")
    private int age;
    private Computer com;

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        System.out.println("set com");
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void coding() {
//        System.out.println("Alien");
        com.compile();
    }

    ;
}

@SpringBootApplication
public class SpringBootSampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootSampleApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        alien.coding();

    }

}
