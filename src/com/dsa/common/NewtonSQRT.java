package com.dsa.common;

//Newton Raphson method
//Time complexity - O(log(N))*F(N)
public class NewtonSQRT {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }

    private static double sqrt(int n){
        double x = n;
        double root;
        while (true){
            root = 0.5 * (x + (n/x)); //sqrt formula of Newton Raphson method
            if(Math.abs(root-x) < 0.5){ //error = | root - x | If we decrease the error even less, we will get the more accurate answer but the iterations will be increased.
                break;
            }
            x = root;
        }
        return root;
    }
}
