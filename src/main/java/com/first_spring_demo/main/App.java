package com.first_spring_demo.main;


import com.first_spring_demo.annotation.Documentary;
import com.first_spring_demo.xmlconfig.Actors;
import com.first_spring_demo.annotation.Netflix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Netflix netflix = (Netflix)context.getBean("movies");
       // System.out.println(netflix);

        Actors actors = (Actors)context.getBean("actors");
        //System.out.println(actors);

        Documentary netflix1 = (Documentary)context.getBean("documentary");
        netflix1.mapActorFiction();
        System.out.println();
    }
}
