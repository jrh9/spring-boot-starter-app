package com.jrh.spring.boot.starter.app.model;

public class Square implements IShape{

    private int x;
    private int y;
    private int area;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getArea() {
        return area;
    }

    public int calculateArea() {
        return x * y;
    }
}

//public class Square extends Shape {
//
//    private int x;
//    private int y;
//
//    public Square(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int calculateArea() {
//        return x * y;
//    }
//}
