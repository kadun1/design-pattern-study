package com.study.designpatterns._02_factorymethod._03_java;

import com.study.designpatterns._02_factorymethod._02_after.BlackShip;
import com.study.designpatterns._02_factorymethod._02_after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException("No such product");
    }
}
