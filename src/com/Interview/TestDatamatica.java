package com.Interview;

import java.util.Scanner;

public class TestDatamatica {

//    Write a program to display all possible permutations of a given input string. If the string contains duplicate characters, you may have multiple repeated results.Input:A string of charactersOutput:
//    Print all possible permutations of the given string
//    Sample Input:cat
//    Sample Output:
//                  cat
//                  cta
//                  act
//                  atc
//                  tac
//                  tca


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String sampleInput;
        sampleInput = sc.next();
        printPermutn(sampleInput,"");
        //write your Logic here


        //OUTPUT [uncomment & modify if required]
//        System.out.println(result);

    }

    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
}
