package org.pursuit.fragmentappfromscratch.model;

public class Planet {
    private String name;
    private int number;
    private String image;

    public Planet(String name, int number, String image) {
        this.name = name;
        this.number = number;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
