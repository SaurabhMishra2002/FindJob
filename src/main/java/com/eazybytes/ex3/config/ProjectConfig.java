package com.eazybytes.ex3.config;

//import com.easzybytes.demo.bean.Vehicle;
import com.eazybytes.ex3.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"package com.eazybytes.ex3.bean"})
public class ProjectConfig {


}
