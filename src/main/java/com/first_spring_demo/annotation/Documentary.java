package com.first_spring_demo.annotation;

import com.first_spring_demo.xmlconfig.Actors;
import com.first_spring_demo.xmlconfig.Fiction;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Component
public class Documentary implements Netflix {
  private Map<Fiction,Actors>fiction;

    public Map<Fiction, Actors> getFiction() {
        return fiction;
    }

    public void setFiction(Map<Fiction, Actors> fiction) {
        this.fiction = fiction;
    }

    public void mapActorFiction(){
        Set keyset = fiction.entrySet();
        Iterator iterator = keyset.iterator();
        while(iterator.hasNext()){
            Map.Entry entrySet = (Map.Entry)iterator.next();
            System.out.println(entrySet.getKey()+" :: "+ entrySet.getValue());
        }
    }
    @Override
    public String toString() {
       mapActorFiction();
       return "";
    }
}
