package com.study.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import com.study.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import com.study.designpatterns._01_creational_patterns._02_factory_method._02_after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("WhiteShip");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
