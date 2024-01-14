package com.dsa.pattern;

public class Main {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(4);
        System.out.println();
        pattern8(4);
        System.out.println();
        pattern9(4);
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(i+i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex=Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        int originalN=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex=originalN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        int originalN=n;
        n=2*n-2;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex=originalN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
