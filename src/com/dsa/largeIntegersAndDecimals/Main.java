package com.dsa.largeIntegersAndDecimals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

//Big integer ranges from -2^(Integer.MAX_VALUE) to 2^(Integer.MAX_VALUE) (exclusive)
//For big decimal range go through official documentation
public class Main {
    public static void main(String[] args) {
        //Big integer implementation starts
        BigInteger a = BigInteger.valueOf(33); // convert int to BI
        int A = a.intValue(); // convert BI to int
        BigInteger b = BigInteger.valueOf(439492332);
        BigInteger c = new BigInteger("495390966231961297643764");

        //constants
        BigInteger d = BigInteger.TEN;

        //operations
        BigInteger add = b.add(c);
        BigInteger sub = c.subtract(b);
        BigInteger mul = b.multiply(c);
        BigInteger div = c.divide(b);
        BigInteger rem = c.remainder(b);
        System.out.println(add + " " + sub + " " + mul + " " + div + " " + rem);

        if(c.compareTo(b) > 0){
            System.out.println("C is greater than b");
        }
        else if(c.compareTo(b) < 0){
            System.out.println("C is less than b");
        }
        else if(c.compareTo(b) == 0){
            System.out.println("C is equal to b");
        }

        //Big decimal implementation starts

        double x = 0.03;
        double y = 0.04;
        System.out.println(y-x);//The answer y-x won't give 0.01 since float and double datatype are floating point numbers. Binary representation of a fraction and exponent.

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        System.out.println(Y.subtract(X));//Big decimal gives exact answer

        BigDecimal bd1 = new BigDecimal("97593493555645.32738729327287");
        BigDecimal bd2 = new BigDecimal("37532932990934.9329830203915453");

        //operations
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_DOWN));
        System.out.println(bd1.pow(2));
        System.out.println(bd1.negate());
    }
}
