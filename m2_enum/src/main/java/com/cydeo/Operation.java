package com.cydeo;

public enum Operation {
    PLUS, MINUS, MULTIPLY, DIVIDE; // each constant is object of Operation


    private Operation() {
        System.out.println("Constructor");
    }
}
