package com.stepik.java_collections;

public class Car {
    String color = "black";

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}

class MiniCar extends Car {
    public MiniCar() {
        this.color = "red";
    }
}

class Omg {
    public static void main(String[] args) {
        System.out.println(new MiniCar());
    }
}