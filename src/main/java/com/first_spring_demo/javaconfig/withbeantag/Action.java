package com.first_spring_demo.javaconfig.withbeantag;

public class Action {
    public String config(){
        return "Action Movie...";
    }

    @Override
    public String toString() {
        return config();
    }
}
