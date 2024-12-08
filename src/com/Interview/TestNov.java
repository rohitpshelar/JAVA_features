package com.Interview;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestNov {

    public static void main(String[] args) {
        String s = "rohitr";
      Stream.of(s.split("")).collect(Collectors.groupingBy(i-> i,Collectors.counting())).entrySet().stream().filter(a->a.getValue()==1).forEach(e-> System.out.println(e.getKey()));
//        System.out.println(m.entrySet());


//        Iterator<String> countryKeySetIterator = m.keySet().iterator();
//        while (countryKeySetIterator.hasNext()) {
//            String countryKey = countryKeySetIterator.next();
//           if(m.get(countryKey)==1){
//               System.out.println(countryKey);
//           }
//        }
    }
}
