package org.example.Config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer computer) { //@Qualifier("laptop") willl give priority to laptop but we can also use Primary annotation
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComputer(computer);
//
//        return obj;
//    }
//
//    //    @Bean(name = {"com1", "desktop2"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
