package com.study.designpatterns._02_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "kadun@gmail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "kadun@gmail.com");
        System.out.println(blackship);
    }
}
