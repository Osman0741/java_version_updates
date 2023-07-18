package com.cydeo.java11;

public class StringMethodDemo {

    public static void main(String[] args) {

        //repeat()

        var str = "Osman ";
        System.out.println(str.repeat(5));

        //isBlank()

        var s ="      ";

        System.out.println(s.isBlank()); // true
        System.out.println(s.isEmpty()); // false


        var s2 = "Osman \n Rana \n Seda";
       // System.out.println(s2);
       s2.lines().forEach(System.out::println);




    }
}
