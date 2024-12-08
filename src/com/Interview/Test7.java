package com.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test7 {

    public static void main(String[] args) {
        String s = "My name is Rohit";
        StringBuilder finalString = new StringBuilder();
        var list = s.split(" ");
//        var as = Arrays.stream(list).collect().toList()
//                ;
//        for (String ssa: as){
//            finalString =  finalString.append(ssa+ " ");
//        }
//        StringBuilder finalString = new StringBuilder(s);
//        for (int i = list.length-1 ; i > -1 ; i--) {
//            finalString =  finalString.concat(list[i]+ " ");
//        }

//        Arrays.stream(list).sorted(Collections.reverseOrder()).forEach(ss ->  finalString.reverse()append(ss+" "));
        System.out.println(finalString);

    }
}


//select count(tid) from transaction group by date having month = "JAN";