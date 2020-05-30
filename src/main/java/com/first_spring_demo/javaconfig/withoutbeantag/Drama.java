package com.first_spring_demo.javaconfig.withoutbeantag;

import com.first_spring_demo.javaconfig.MovieGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Drama {
    @Autowired
    @Qualifier("thriler2")
    private MovieGenre movieGenre;

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String config(){
        return "Drama Movie...";
    }
    @Override
    public String toString() {
        return config() + movieGenre.config();
    }
}
