package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TraderData {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions =Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );
       //Find all transactions in the year 2011 and sort them by value(small to high)
        transactions.stream()
                .filter(i->i.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("========================================");
        //What are all the unique cities where the traders work?
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("========================================");

        //Find all traders from Cambridge and sort them by name.

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(i->i.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .map(Trader::getName)
                .forEach(System.out::println);

        System.out.println("========================================");

        //Return a string of all traders’ names sorted alphabetically

        transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .map(Trader::getName)
                .forEach(System.out::println);

        System.out.println("=======================================");

        //Are any traders based in Milan?

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(i->i.getCity().equals("Milan"))
                .map(Trader::getName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("===========================================");

        //Print the values of all transactions from the traders living in Cambridge.

        transactions.stream()
                .filter(i->i.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        System.out.println("===========================================");

        //What is the highest value of all the transactions?

        int maxValue= transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max).get();

        System.out.println("maxValue = " + maxValue);

        System.out.println("===========================================");

        //Find the transaction with the smallest value.

     int minValue =   transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min).get();

        System.out.println("minValue = " + minValue);







    }
}

