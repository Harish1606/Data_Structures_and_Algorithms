package com.dsa.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEach {
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
        list.forEach(ForEach::doubleTheValue);
    }

    public static void doubleTheValue(int i){
        System.out.println(i*2);
    }
}
