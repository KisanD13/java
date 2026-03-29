package org.example.springbootsample.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class Desktop implements Computer {
    public void compile() {
        System.out.println("Desktop compile");
    }
}
