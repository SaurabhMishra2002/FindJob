package com.eazybytes.ex4.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car(){
        System.out.println("Car Bean created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

}
