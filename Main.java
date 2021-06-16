package com.metanit;
public class Main {
    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<Vehicle>();

        garage.addTransport(new Car("Audi", "grey", 100));

        garage.addTransport(new Motorcycle("Honda", "red", 80));
        garage.print();

    }
}


