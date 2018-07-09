package com.jrh.spring.boot.starter.app.model;

public class Circle implements IShape {

    private int r;
    private int area;

    public Circle (int r) {
        this.r = r;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int calculateArea() {
        return 3 * r * r;
    }
}

//public class Circle extends Shape {
//
//    private int r;
//
//    public Circle(int r) {
//        this.r = r;
//    }
//
//    public int calculateArea() {
//        return (int) 3.14 * r * r;
//    }
//
//
//}
