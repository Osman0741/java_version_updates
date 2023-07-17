package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {

    public static void main(String[] args) {

        List<Car> carList= new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

        System.out.println(filterFastCars(carList));

        System.out.println(filterNewCars(carList));

        System.out.println("========================================");

     //   System.out.println(filter(carList, new CarFastPredicate()));

    //    System.out.println(filter(carList, new CarNewPredicate()));

        Predicate<Car> fastCarPredicate = car->car.getTopSpeed()>160;
        System.out.println("Fast Cars");
        System.out.println(filter(carList, fastCarPredicate));

        System.out.println("New Cars");
        System.out.println(filter(carList, car -> car.getYear() > 2015));


    }
             //Before Behavior Parameterization
     private static List<Car> filterFastCars(List<Car> cars){

        List<Car> filteredFast = new ArrayList<>();

         for (Car car : cars) {
             if(car.getTopSpeed()>160){
                 filteredFast.add(car);
             }

         }
         return filteredFast;
     }

    private static List<Car> filterNewCars(List<Car> cars){

        List<Car> filteredNew = new ArrayList<>();

        for (Car car : cars) {
            if(car.getTopSpeed()>160){
                filteredNew.add(car);
            }

        }
        return filteredNew;
    }

    // With Behavior Parameterization
    private static List<Car> filter(List<Car> cars, Predicate<Car> predicate){

        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if(predicate.test(car))
                result.add(car);
        }
        return result;
    }

}
