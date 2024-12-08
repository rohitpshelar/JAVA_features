package com.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Tes {

    public static void main(String[] args) {
//        input = {-3,-1,-5,8,5,9,2}
//        output = {-5,-3,-1,9,8,5,2}

        Integer[] input = {-3,-1,-5,8,5,9,2};
        Stream.of(input).sorted().forEach(System.out::println);


//        List<Integer> i = new ArrayList<>(List.of(input));
//        Collections.sort(i);
//        List<Integer> finaalL = new ArrayList<>();
//        List<Integer> finaalr = new ArrayList<>();
//        for (int j = 0; j < i.size() ; j++) {
//            if(i.get(j) < 0){
//                finaalL.add(i.get(j));
//            }else {
//                finaalr.add(i.get(j));
//            }
//        }
//        Collections.reverse(finaalr);
//        finaalL.addAll(finaalr);
//        for (var ff:finaalL){
//            System.out.println(ff);
//        }

    }
}
