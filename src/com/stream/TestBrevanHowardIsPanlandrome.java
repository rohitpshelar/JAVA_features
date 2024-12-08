package com.stream;

public class TestBrevanHowardIsPanlandrome {

    static void isPanlandrome(String s){
        boolean pal = true;
        for (int i = 0; i < s.length(); i++) {
            if(!(s.charAt(i)== s.charAt(s.length()-1-i))){
                pal = false;
            }
        }
        if(pal) {
            System.out.println(" is Palindrome");
        }else
            System.out.println(" is Not Palindrome");
    }

    public static void main(String[] args) {        String s = "ab";
        isPanlandrome(s);

    }

}
