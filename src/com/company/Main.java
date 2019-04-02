package com.company;

public class Main {

    public static void main(String[] args) {

        Room room = new Room("Green", 3);
        room.setSquare(67);
        room.setColor("Red");
        System.out.println(room);

        Room anotherRoom = new Room("Gray", 8.9);
        System.out.println(anotherRoom);
    }
}
