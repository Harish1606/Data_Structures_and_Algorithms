package com.dsa.stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        //External iterations
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        for (int i : list){
//            System.out.println(i);
//        }

        //Internal iterations
        //Method reference
        list.forEach(System.out::println);

        //Method reference of static method can be implemented as below
        list.forEach(Main::doubleTheValue);

        //Sum of all values multiplied by 2 in the list
        System.out.println(list.stream().map(i -> i*2).reduce(0,Integer::sum));

        List<Integer> list1 = Arrays.asList(12,20,35,46,55,68,75);

        //Sum of all values divisible by 5
        System.out.println(list1.stream().filter(i -> i%5==0).reduce(0,Integer::sum));

        //Find first element in the list divisible by 5, if there is no element it will return 0
        System.out.println(list1.stream().filter(i -> i%5==0).findFirst().orElse(0));

        //Map and filter are lazy functions whereas findfirst are terminal functions.
        //Findfirst will execute before the map and reduce functions, which makes stream api more efficient.

    }

    public static void doubleTheValue(int i){
        System.out.println(i*2);
    }
}
