package com.study.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import com.study.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import com.study.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import com.study.designpatterns._01_creational_patterns._02_factory_method._02_after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
