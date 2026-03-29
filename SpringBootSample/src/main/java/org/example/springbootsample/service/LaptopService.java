package org.example.springbootsample.service;

import org.example.springbootsample.LaptopRepositoy;
import org.example.springbootsample.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepositoy laptopRepositoy;

    public void addLaptop(Laptop laptop) {
        laptopRepositoy.saveLaptop(laptop);
    }

    public Boolean isGoodLaptop(Laptop laptop) {
        return true;
    }
}
