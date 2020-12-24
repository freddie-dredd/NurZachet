package com.company;

public abstract class Clothes {
    int size;
    int cost;
    String color;

    public int sizeInfo() {
        return size;
    }

    public void changeSize(int size) {
        this.size = size;
    }

    public double costInfo() {
        return cost;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
