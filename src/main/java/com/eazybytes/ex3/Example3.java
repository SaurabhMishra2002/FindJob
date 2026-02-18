package com.eazybytes.ex3;


import com.eazybytes.ex3.bean.Vehicle;
import com.eazybytes.ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
        static void main(String[] args) {

            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            var veh = context.getBean(Vehicle.class);
            System.out.println("Vehicle name from spring context is:" + veh.getName());
            veh.sayHello();
            context.close();
            /*
            * We donot need to do any explicit casting while fetching
            * a bean from context.
            * Spring is smart enough to look for a bean of the type
            * you requested in its context.
            * If such a bean doesn't exist.
            *  Spring will throw an exception
            * */

//            String hello = context.getBean(String.class);
//            System.out.println("Hello from Spring Context:" + hello);
//
//            Integer LuckyNumber =  context.getBean(Integer.class);
//            System.out.println("Hello from Spring Context:" + LuckyNumber);
    }

}
