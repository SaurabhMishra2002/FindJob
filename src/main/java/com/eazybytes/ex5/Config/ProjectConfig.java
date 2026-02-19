package com.eazybytes.ex5.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.eazybytes.ex5.beans"})
public class ProjectConfig {
}
