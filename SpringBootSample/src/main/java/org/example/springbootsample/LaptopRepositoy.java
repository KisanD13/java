package org.example.springbootsample;

import org.example.springbootsample.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepositoy {
    public void saveLaptop(Laptop laptop) {
        System.out.println("saveLaptop in DB");
    }
}
