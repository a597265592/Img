package com.example.admin.img.other.bulider;

/**
 * Created by admin on 2017/4/27.
 */

public class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(Builder builder) {
        this.mBoard = builder.board;
        this.mDisplay = builder.display;
        this.mOS = builder.os;
    }

    public static abstract class Builder {
        protected String board;
        protected String display;
        protected String os;

        public abstract Builder buildBoard(String board);
        public abstract Builder buildDisplay(String display);
        public abstract Builder buildOS();
        public abstract Computer build();
    }

    @Override
    public String toString() {
        return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay + ", mOS=" + mOS + "]";
    }
    //Computer其他重要操作
}
