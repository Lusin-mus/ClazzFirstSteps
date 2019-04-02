package com.company;

public class Room {
    private String color;
    private int height;
    private int width;
    private double square;

    //Constructor
    public Room(int inputHeight, String inputColor) {
        this.color = inputColor;
        this.height = inputHeight;
    }

    public Room(String inputColor, int inputWidth) {
        this.color = inputColor;
        this.width = inputWidth;
    }

    public Room(String color, double square) {
        this.color = color;
        this.square = square;
    }

    //Access data methods
    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getSquare() {
        return square;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Room details:\n" +
                "Height is: " + this.height +
                "\nSquare is: " + this.square +
                "\nColor is: " + this.color + "\n";
    }
}

