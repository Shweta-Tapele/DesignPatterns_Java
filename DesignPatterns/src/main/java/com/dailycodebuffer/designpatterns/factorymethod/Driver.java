package com.dailycodebuffer.designpatterns.factorymethod;
// Factory design patterns belongs to creational design patterns
// Objects are created without exposing the logic of creation
// Enables loose coupling
//Factory pattern is used for methods like Integer.valueOf methods in wrapper classes
public class Driver {



    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape t = shapeFactory.getShapeInstance("Triangle");
        t.draw();


    }
}
