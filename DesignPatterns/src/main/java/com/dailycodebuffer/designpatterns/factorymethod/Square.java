package com.dailycodebuffer.designpatterns.factorymethod;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square drawn");
    }
}
