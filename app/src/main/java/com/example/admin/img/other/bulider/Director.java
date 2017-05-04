package com.example.admin.img.other.bulider;

/**
 * Created by admin on 2017/4/27.
 */

public class Director {
    private Computer.Builder mBuilder;

    public Director(Computer.Builder builder) {
        this.mBuilder = builder;
    }

    public void buildPC(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
