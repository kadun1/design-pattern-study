package com.study.designpatterns._02_structural_patterns._12_proxy._03_java;


import com.study.designpatterns._02_structural_patterns._12_proxy._02_after.DefaultGameService;
import com.study.designpatterns._02_structural_patterns._12_proxy._02_after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {
    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[] {GameService.class}, (proxy, method, args) -> {
            System.out.println("Hello dynamic proxy");
            method.invoke(target, args);
            return null;
        });
    }
}
