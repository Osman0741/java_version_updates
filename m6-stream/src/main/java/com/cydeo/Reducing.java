package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        Optional<Integer>  result2 = numbers.stream().reduce((a,b)->a+b);

        System.out.println("Dish calories total: ");
       int calTotal = DishData.getAll().stream().map(Dish::getCalories)
           //     .reduce((a,b)->a+b).get();
                   .reduce(Integer::sum).get();
        System.out.println(calTotal);

       Optional<Integer> min=  numbers.stream().reduce(Integer::min);
       Optional<Integer> max = numbers.stream().reduce(Integer::max);
       Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());

        System.out.println("Count");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);
    }
}
