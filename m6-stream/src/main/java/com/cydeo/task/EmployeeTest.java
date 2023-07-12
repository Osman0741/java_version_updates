package com.cydeo.task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails
        EmployeeData.readAll().map(Employee::getEmpEmail)
                .forEach(System.out::println);


        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all phone numbers with double colon");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List:: stream)
                .forEach(System.out::println);

    }
}
