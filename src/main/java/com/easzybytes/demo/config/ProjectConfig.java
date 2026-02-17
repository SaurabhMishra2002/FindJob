package com.easzybytes.demo.config;

import com.easzybytes.demo.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Tesla");
       //System.out.println(veh);

        return veh;
    }
/*
*The method names usually follow verb notation. but for methods
* which we will use to create beans,can use noun as names
* This will be  a good practice as the method name will become bean
* names as well in the context.
 */
    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer LuckyNumber(){
        return 16;
    }

}
