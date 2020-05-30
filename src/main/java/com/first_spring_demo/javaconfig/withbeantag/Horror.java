package com.first_spring_demo.javaconfig.withbeantag;

import com.first_spring_demo.javaconfig.MovieGenre;
import com.first_spring_demo.javaconfig.withbeantag.Action;
import org.springframework.beans.factory.annotation.Autowired;


public class Horror  {
    @Autowired
    private Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String config(){
        return "Horror Movie...";
    }
    @Override
    public String toString() {
        return config() +  action.config();
    }
}
