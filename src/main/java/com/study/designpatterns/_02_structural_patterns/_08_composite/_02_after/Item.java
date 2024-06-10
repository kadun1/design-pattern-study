package com.study.designpatterns._02_structural_patterns._08_composite._02_after;

public class Item implements Component {

    private String name;
    private int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
