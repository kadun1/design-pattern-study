package com.study.designpatterns._02_structural_patterns._08_composite._01_before;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란의 검", 450);
        Item healthPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healthPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
//                bag.getItems().stream().reduce(0, (subtotal, element) -> subtotal + element.getPrice(), Integer::sum);
        System.out.println("sum = " + sum);
    }
}
