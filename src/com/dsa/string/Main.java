package com.dsa.string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String is the type of object which is used to store collection of characters and it is non primitive datatype.
        //Strings are immutable which means we can't directly modify the value.

        //String literal (Static)
        //Objects will be created in the string constant pool which is separate memory structure inside the heap
        //If two strings has the same value, then the two reference variable will point to the same object in the string constant pool and if one of the string value got changed, it will be created as separate object in the string constant pool and the reference variable will point to it.
        //Memory usage will be less
        String str = "Hello world";

        //new keyword (Dynamic)
        //Objects will be created in the heap memory
        //Here separate objects will be created in the heap memory, even if the two strings has the same value
        //Memory usage will be more
        String str1 = new String("Hello world");

        //Inbuilt functions
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.equals(str1));
        System.out.println(str.replace('H','h'));
        System.out.println(str.split(" "));
        System.out.println(Arrays.toString(str.toCharArray()));

        //StringBuilder represents a mutable sequence of characters
        //StringBuilder does not provides synchronization so, it is not thread safe which means multiple thread may access the same instance of string builder.
        //StringBuilder is faster compared to StringBuffer
        //Here objects are created in the heap memory and the reference variable in the stack memory will point to it.
        StringBuilder sb = new StringBuilder();
        sb.append("Hello world");
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(0));
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}
