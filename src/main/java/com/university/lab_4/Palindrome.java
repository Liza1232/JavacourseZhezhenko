package com.university.lab_4;

public class Palindrome {
    public static boolean isPalindrome(String str){
        str = str.replaceAll("[\\s.,?!;:']","").toLowerCase();
        int firstSymb = 0;
        int lastSymb = str.length() - 1;
        while(firstSymb < lastSymb){
            if(str.charAt(firstSymb) != str.charAt(lastSymb)){
                return false;
            }
            firstSymb++;
            lastSymb--;
        }
        return true;
    }
}
