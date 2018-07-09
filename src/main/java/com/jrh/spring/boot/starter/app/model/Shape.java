package com.jrh.spring.boot.starter.app.model;

public abstract class Shape {

    private int area;

    public Shape() {

    }

    public Shape(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public abstract int calculateArea();
}
