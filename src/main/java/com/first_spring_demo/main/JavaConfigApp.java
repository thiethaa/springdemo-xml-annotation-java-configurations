package com.first_spring_demo.main;

import com.first_spring_demo.javaconfig.withbeantag.AppConfig;
import com.first_spring_demo.javaconfig.withbeantag.Horror;
import com.first_spring_demo.javaconfig.withoutbeantag.AppConfig2;
import com.first_spring_demo.javaconfig.withoutbeantag.Drama;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Horror movie = context.getBean(Horror.class);
       System.out.println(movie);

//       Action movie1 = context.getBean(Action.class);
//        System.out.println(movie1);

        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        Drama drama= context2.getBean(Drama.class);
        //System.out.println(drama);
    }
}
