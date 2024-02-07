package com.study.designpatterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "WhiteShip", "kadun@gmail.com");
        client.print(new BlackShipFactory(), "BlackShip", "kadun@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
