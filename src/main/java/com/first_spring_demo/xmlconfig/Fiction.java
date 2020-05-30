package com.first_spring_demo.xmlconfig;

public class Fiction {
    private int year;
    private String story;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return
                "\nFiction :" +
                        "\nid\t\t=\t" + year +
                        "\nname\t=\t" + story;

    }
}
