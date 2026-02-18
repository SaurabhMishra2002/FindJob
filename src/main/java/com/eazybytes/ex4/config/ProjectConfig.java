package com.eazybytes.ex4.config;

//import com.easzybytes.demo.bean.Vehicle;
import com.eazybytes.ex4.bean.Person;
import com.eazybytes.ex4.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = {"package com.eazybytes.ex3.bean"})
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    Person person(){
        Person person = new Person();
        person.setName("John");
        person.setVehicle(vehicle());
        return person;
    }
}
