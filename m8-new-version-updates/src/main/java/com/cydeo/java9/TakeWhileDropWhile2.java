package com.cydeo.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile2 {

    public static void main(String[] args) {


        List<Employee> employeeList = getEmployee();
        System.out.println("List");
        System.out.println(employeeList);

        System.out.println("===============================");

        System.out.println("Filtered by using takeWhile");
        List<String> nameBelow60000 = getNameBelow60000(employeeList);
        System.out.println(nameBelow60000);

        System.out.println("===============================");

        System.out.println("Filtered by using dropWhile");
        List<String> nameAbove60000 = getNameAbove60000(employeeList);
        System.out.println(nameAbove60000);





    }

    private static List<String> getNameAbove60000(List<Employee> employeeList) {

        return  employeeList.stream().peek(p-> System.out.println(p))
                .dropWhile(TakeWhileDropWhile2::isSalaryLessThan60000)
                .map(Employee::getName).collect(Collectors.toList());
    }

    private static List<String> getNameBelow60000(List<Employee> employeeList) {
        return employeeList.stream()
                .peek(p-> System.out.println(p))
                .takeWhile(TakeWhileDropWhile2::isSalaryLessThan60000)
                .map(Employee::getName).collect(Collectors.toList());
    }

    private static boolean isSalaryLessThan60000(Employee employee) {
        return employee.getSalary().compareTo(BigDecimal.valueOf(60000))<=0;
    }


    private static List<Employee> getEmployee() {

        List<Employee> employeeList = Arrays.asList(

                new Employee("Osman", BigDecimal.valueOf(85000)),
                new Employee("Ali",BigDecimal.valueOf(75000)),
                new Employee("Murat",BigDecimal.valueOf(100000)),
                new Employee("Mary",BigDecimal.valueOf(55000)),
                new Employee("Tomy",BigDecimal.valueOf(45000))

        );

        return employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
    }
}
