package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){

        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("100200300","400500600")),
                new Employee(101,"Smith","smith@cydeo.com", Arrays.asList("50006000700","400500700")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("9100200600","700100300"))


        );
    }
}
