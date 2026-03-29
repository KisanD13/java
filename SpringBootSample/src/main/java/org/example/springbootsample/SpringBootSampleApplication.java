package org.example.springbootsample;

import org.example.springbootsample.model.Alien;
import org.example.springbootsample.model.Laptop;
import org.example.springbootsample.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootSampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootSampleApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);

        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);
//        Alien alien = context.getBean(Alien.class);
//        alien.coding();

    }

}
