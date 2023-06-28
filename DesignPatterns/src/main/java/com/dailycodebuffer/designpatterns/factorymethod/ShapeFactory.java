package com.dailycodebuffer.designpatterns.factorymethod;

public class ShapeFactory {

    Shape getShapeInstance(String shape)
    {
        if(shape.equalsIgnoreCase("Triangle"))
        {
            return new Triangle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();

        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();

        }
        else
        {
            return null;
        }
    }
}
