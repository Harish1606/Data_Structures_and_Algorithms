package com.dsa.recursion.string;

//Time complexity - O(N)
//Space complexity - O(N)
public class RemoveLetter {
    public static void main(String[] args) {
        String s = "cgandhapplekdif";
        String f = "apple";
        System.out.println(remove(s, f));
    }

    private static String remove(String s, String f) {
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(f)){
            return remove(s.substring(f.length()), f);
        }
        else{
            return s.charAt(0) + remove(s.substring(1), f);
        }
    }
}
