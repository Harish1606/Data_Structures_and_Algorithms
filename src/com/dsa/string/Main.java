package com.dsa.string;

import java.text.DecimalFormat;
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

        //Some of the inbuilt functions
        System.out.println("String inbuilt functions");
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.equals(str1));
        System.out.println(str.replace('H','h'));
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println();
        //StringBuilder represents a mutable sequence of characters
        //StringBuilder does not provides synchronization so, it is not thread safe which means multiple thread may access the same instance of string builder.
        //StringBuilder is faster compared to StringBuffer
        //Here objects are created in the heap memory and the reference variable in the stack memory will point to it.
        StringBuilder sb = new StringBuilder();

        //Some of the inbuilt functions
        System.out.println("StringBuilder inbuilt functions");
        sb.append("Hello world");
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(0));
        System.out.println(sb.length());
        System.out.println(sb.toString());

        System.out.println();
        //StringBuffer represents a mutable sequence of characters
        //StringBuffer provides synchronization so, it is thread safe which means multiple thread cannot access the same instance of string buffer.
        //StringBuffer is slower compared to StringBuilder
        //Here objects are created in the heap memory and the reference variable in the stack memory will point to it.
        System.out.println("StringBuffer inbuilt functions");

        //constructor1
        StringBuffer sbf1 = new StringBuffer();
        System.out.println(sbf1.capacity());
        sbf1.append("Full stack development");
        sbf1.append(" is nice");
        sbf1.insert(23, "and mobile app development ");
        sbf1.replace(50,52,"are");
        sbf1.delete(0,5);
        sbf1.reverse();
        String temp = sbf1.toString();

        //constructor2
        StringBuffer sbf2 = new StringBuffer("Harish");

        //constructor3
        StringBuffer sbf3 = new StringBuffer(30);

        System.out.println(sbf1);

        //Generating random string
        System.out.println(RandomString.generate(10));

        //Removing white spaces
        String sentence = "Hi H a r i s h";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll(" ",""));

        //Split string based on whitespaces
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        //Rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.2));
    }
}
