package com.eazybytes.ex3.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements InitializingBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void sayHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "Tesla";
    }

//    @PostConstruct
//    public void initialize(){
//        this.name = "Audi";
//    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying Vehicle Bean");
    }
}

