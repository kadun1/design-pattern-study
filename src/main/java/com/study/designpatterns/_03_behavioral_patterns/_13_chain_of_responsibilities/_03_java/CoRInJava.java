package com.study.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._03_java;

import jakarta.servlet.*;

import java.io.IOException;

public class CoRInJava {
    public static void main(String[] args) {
        Filter filter = (request, response, chain) -> chain.doFilter(request, response);
    }
}
