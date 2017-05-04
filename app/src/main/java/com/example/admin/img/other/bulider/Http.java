package com.example.admin.img.other.bulider;

/**
 * Created by admin on 2017/4/28.
 */

public class Http {
    private String mothe;
    private String url;
    private String head;




    public abstract class Builder{
        public String mothe;
        public String url;
        public String head;

        public abstract Builder buildBoard(String board);
        public abstract Builder buildDisplay(String display);
        public abstract Builder buildOS();
        public abstract Computer build();
    }
}
