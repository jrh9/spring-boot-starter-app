package com.jrh.spring.boot.starter.app;

import com.jrh.spring.boot.starter.app.model.Circle;
import com.jrh.spring.boot.starter.app.model.IShape;
import com.jrh.spring.boot.starter.app.model.Shape;
import com.jrh.spring.boot.starter.app.model.Square;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        List<IShape> shapeList = new ArrayList<>();

        Square s = new Square(2, 6);
        Circle c = new Circle(4);

        shapeList.add(s);
        shapeList.add(c);

        for (IShape shape : shapeList) {
            System.out.println(shape.calculateArea());
        }

//        SpringApplication.run(Application.class, args);

    }
}