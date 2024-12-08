package com.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindPalindromesFromString {

//    Given a string and a number depicting the size of all the palindromes,
//    find all the palindromes from that string which are present as substrings

//    "aahhhhxyxtptndyyhb"

    private List<String> l = new ArrayList<>();
    private boolean ispalindrom(String s) {
        boolean state = true;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == s.charAt(s.length()-1-i))) {
                state = false;
            }
        }
        return state;
    }

    private void newWay(String a){
        for (int j = 0; j < a.length(); j++) {
            String b = a.substring(j);
            if(ispalindrom(b)){
                l.add(b);
            }
            for (int k = 0; k < b.length(); k++) {
                String c = b.substring(0,b.length()-k);
                if(ispalindrom(c)){
                    l.add(c);
                }
            }
        }
    }

    public List<String> filterNewWay(String a, int i){
        newWay(a);
       return  new HashSet<>(l).stream().filter(s-> s.length() == i).toList();

    }

    public static void main(String[] args) {
        new FindPalindromesFromString().filterNewWay("aahhhhxyxtptndyyhb",1);
    }
}
