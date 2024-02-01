package com.example.team21;

public abstract class Shape {
    protected Integer x;
    protected Integer y;
    String color = "Magenta"; //This is the main color of shape
    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
