package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arrA = {1,6,4,1,17,3,17,4,5,12,2,14,5,2};
        List<Integer> arrB = new ArrayList<>();
        int i, j;

        for (i = 0; i < arrA.length -1; i++) {
            for (j = i + 1; j < arrA.length; j++){
                if (arrA[i] == arrA[j]) {
                    arrB.add(arrA[i]);
                }
            }
        }
        System.out.println(arrB);
    }
}