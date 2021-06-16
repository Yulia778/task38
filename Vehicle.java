package com.metanit;

import java.awt.*;
import java.util.Objects;

public class Vehicle {
    private String name;
    private int speed;
    String color;

    public Vehicle(String name, String color, int speed
    ) {
        this.name = name;
        this.color = color;
        this.speed = speed;

    }

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && Objects.equals(name, vehicle.name) && Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, color);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color=" + color +
                '}';
    }
}
