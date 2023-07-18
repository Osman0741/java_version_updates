package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {
        // var can be used only as local variable
        String str;
        str ="Osman";

        var s = "Rana";

        var number = 5; // int value by default
        var price = 12.50; // double by default

        var numbers = Arrays.asList(1,2,3,4,5);

        var sum = 0 ;
        for (var eachNumber : numbers) {
            sum = sum + eachNumber;

        }
    }
}
