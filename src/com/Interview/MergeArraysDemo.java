package com.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MergeArraysDemo{

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};

        int arr2[] = {2, 4, 6, 8};

        int arr3[] = mergeArrays(arr1, arr2,3);
        System.out.println("Array after merging - " + Arrays.toString(arr3));
    }

    public static int[]  mergeArrays(int[] arr1, int[] arr2, int type) {
        if(type ==1) {
            int[] mergedArray = new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
            System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
            return Arrays.stream(mergedArray).sorted().toArray();
        }else if (type ==2) {
            return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        } else {
            List<Integer> l = new ArrayList<>();
            for (var a:arr1){
                l.add(a);
            }
            for (var b:arr2) {
                l.add(b);
            }
            Collections.sort(l);
            return l.stream().mapToInt(i->i).toArray();
        }
    }

}