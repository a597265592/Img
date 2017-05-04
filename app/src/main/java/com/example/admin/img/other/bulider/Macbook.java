package com.example.admin.img.other.bulider;

/**
 * Created by admin on 2017/4/27.
 */

public class Macbook extends Computer {


    protected Macbook(Builder builder) {
        super(builder);
    }

    public static class Builder extends Computer.Builder {

        @Override
        public Computer.Builder buildBoard(String board) {
            this.board = board;
            return this;
        }

        @Override
        public Computer.Builder buildDisplay(String display) {
            this.display = display;
            return this;
        }

        @Override
        public Computer.Builder buildOS() {
            this.os = "Mac OS X 10.10";
            return this;
        }

        @Override
        public Computer build() {
            return new Macbook(this);
        }
    }
}