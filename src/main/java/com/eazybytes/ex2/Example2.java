package com.eazybytes.ex2;


import com.eazybytes.ex2.bean.Vehicle;
import com.eazybytes.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
        static void main(String[] args) {
            Vehicle vehicle = new Vehicle();
            vehicle.setName("Audi");
            System.out.println("Vehicle name from non spring context is:" + vehicle.getName());

            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            var veh = context.getBean(Vehicle.class);
            System.out.println("Vehicle name from spring context is:" + veh.getName());

            /*
            * We donot need to do any explicit casting while fetching
            * a bean from context.
            * Spring is smart enough to look for a bean of the type
            * you requested in its context.
            * If such a bean doesn't exist.
            *  Spring will throw an exception
            * */

            String hello = context.getBean(String.class);
            System.out.println("Hello from Spring Context:" + hello);

            Integer LuckyNumber =  context.getBean(Integer.class);
            System.out.println("Hello from Spring Context:" + LuckyNumber);
    }

}
