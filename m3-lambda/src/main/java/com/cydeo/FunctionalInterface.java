package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static  void main(String[] args) {
        System.out.println("=============PREDICATE=====================");
        Predicate<Integer> largerThan = p->p>20;
        System.out.println(largerThan.test(10));

        System.out.println("=============CONSUMER=====================");

        Consumer<String> print = p-> System.out.println(p);
        print.accept("Osman");

        System.out.println("=============BI CONSUMER=====================");

        BiConsumer<Integer, Integer> printOfSum = (x,y)-> System.out.println(x+y);
        printOfSum.accept(8,9);

        System.out.println("=============FUNCTION=====================");

        Function<Integer,Integer> method = p -> p*2;
        System.out.println(method.apply(5));

        System.out.println("=============BI FUNCTION=====================");

        BiFunction<Integer,Integer,Integer> sum = (x,y) -> x+y;

        System.out.println(sum.apply(2, 4));

        System.out.println("=============SUPPLIER=====================");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
