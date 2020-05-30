package com.first_spring_demo.javaconfig.withoutbeantag;

import com.first_spring_demo.javaconfig.MovieGenre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Thriler2 implements MovieGenre {
    public String config(){
        return "Thriler2 Movie...";
    }
}
