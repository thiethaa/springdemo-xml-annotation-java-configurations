package com.first_spring_demo.annotation;

import com.first_spring_demo.xmlconfig.Actors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Component
public class Series implements Netflix {
    @Autowired
    private Set<Actors> actors;

    public Set<Actors> getActors() {
        return actors;
    }

    public void setActors(Set<Actors> actors) {
        this.actors = actors;
    }

    private void displayActors(){
        Iterator iterator = actors.iterator();
        while(iterator.hasNext()){
           Actors actor = (Actors) iterator.next();
            System.out.println( actor);
        }
    }

    @Override
    public String toString() {
        displayActors();
        return "its working";

    }
}
