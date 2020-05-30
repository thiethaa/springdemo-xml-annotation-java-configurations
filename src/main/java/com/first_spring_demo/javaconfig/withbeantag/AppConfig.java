package com.first_spring_demo.javaconfig.withbeantag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Horror getHorrorMovie(){
        return  new Horror();
    }

    @Bean
    public Action getActionMovie(){
        return  new Action();
    }

}
