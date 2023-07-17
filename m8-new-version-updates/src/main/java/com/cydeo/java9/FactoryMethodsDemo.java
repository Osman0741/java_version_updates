package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {

    public static void main(String[] args) {

        //Creating unmodifiable List before Java 9

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
      //  courses.add("TS");
        System.out.println(courses);

        //Creating unmodifiable List after Java 9

        List<String> myCourses = List.of("Java","Spring","Agile");

        //Creating unmodifiable Set after Java 9

        Set<String> myProducts = Set.of("Milk","Bread","Butter");

        //Creating unmodifiable Map after Java 9

        Map<String, Integer> myCArt = Map.ofEntries(
                Map.entry("Samsung TV", 1),
                Map.entry("Laptop",2),
                Map.entry("Chair",10)
        );






    }
}
