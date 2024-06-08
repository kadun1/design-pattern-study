package com.study.designpatterns._02_structural_patterns._07_bridge._01_before;

public class PoolParty아칼리 implements Champion {
    @Override
    public void move() {
        System.out.println("PoolParty 아칼리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty 아칼리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty 아칼리 W");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty 아칼리 E");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty 아칼리 R");
    }
}
