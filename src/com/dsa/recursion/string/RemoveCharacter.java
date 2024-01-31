package com.dsa.recursion.string;

//Time complexity - O(N)
//Space complexity - O(N)
public class RemoveCharacter {
    public static void main(String[] args) {
        char c = 'a';
        String s = "afagecaabbda";
        System.out.println(remove(s, c));
    }

    private static String remove(String s, char c) {
        if(s.isEmpty()){
            return "";
        }
        if(s.charAt(0) == c){
            return remove(s.substring(1), c);
        }
        else{
            return s.charAt(0) + remove(s.substring(1), c);
        }
    }
}
