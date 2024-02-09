package com.study.designpatterns._01_creational_patterns._02_factory_method._02_after;

public interface ShipFactory {
    Ship orderShip(String name, String email);
    Ship createShip();
}
