package com.example.fragment;

public class Model {
   int image;
   String name;


    public Model(int image, String name) {
        this.image = image;
        this.name = name;
    }
    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }


    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}
