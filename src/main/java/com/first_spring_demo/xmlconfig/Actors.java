package com.first_spring_demo.xmlconfig;

import org.springframework.stereotype.Component;

public class Actors {
    //@Value("202")
    private int id;
   // @Value("mohammad zaman")
    private String name;

    public Actors() {
    }

    public Actors(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String display() {
        return "its working....";
    }

    @Override
    public String toString() {

        return
                "\nActors :" +
                            "\nid\t\t=\t" + id +
                            "\nname\t=\t" + name;

    }
}
