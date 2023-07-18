package com.cydeo.java10;

import java.util.Arrays;
import java.util.Optional;

public class OrElseThrowDemo {

    public static void main(String[] args) {

        Optional<String> str = Optional.of("Osman");

        System.out.println(str.get());

        if(str.isPresent()){
            System.out.println(str.get());
        }else {
             new Exception("No Value");
        }



        System.out.println(str.orElseThrow());


    }
}
