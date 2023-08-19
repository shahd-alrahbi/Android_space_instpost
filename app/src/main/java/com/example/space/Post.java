package com.example.space;

public class Post {

    private String Tital;
    private String image;

    public Post(String tital, int image) {
        Tital = tital;
        this.image = String.valueOf(image);
    }

    public String getTital() {
        return Tital;
    }

    public String getImage() {
        return image;
    }
}
