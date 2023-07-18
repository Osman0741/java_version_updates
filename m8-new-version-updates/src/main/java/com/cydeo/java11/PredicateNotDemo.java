package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class PredicateNotDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> even = p-> p%2==0;
        Predicate<Integer> odd  = not(even);

        System.out.println(odd.test(11));


        List<Integer> oddNumbers = list.stream()
                .filter(not(even))
                .collect(Collectors.toList());

        System.out.println(oddNumbers);


    }
}
