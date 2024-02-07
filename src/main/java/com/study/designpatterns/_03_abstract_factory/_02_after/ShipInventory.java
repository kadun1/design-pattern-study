package com.study.designpatterns._03_abstract_factory._02_after;

import com.study.designpatterns._02_factory_method._02_after.Ship;
import com.study.designpatterns._02_factory_method._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
