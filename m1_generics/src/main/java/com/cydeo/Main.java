package com.cydeo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
     //   items.add("Apple");
        printDoubled(items);


        System.out.println("========================================");


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");

       // liverpool.addPlayer(joe);
       // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println("========================================");

        Integer[] array = {1,2,3,4,5};

        swap(array,0,2);




    }
    private static void printDoubled(ArrayList<Integer> items){

        for (Integer i : items) {
            System.out.println(i*2);

        }

    }
    private static <T> void swap(T[] array, int a, int b){
        ArrayList<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }

        Collections.swap(list,a,b);
        System.out.println(list);

    }
}
