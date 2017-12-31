package main.java.CodilityTestDemo;

import java.util.TreeSet;

class Solution {
    public int solution(int[] A) {

        TreeSet<Integer> integers = new TreeSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                integers.add(A[i]);
            }
        }

        int pomocnicza = 1;
        for (Integer integer : integers) {
            if (integer > pomocnicza) {
                return pomocnicza;
            }
            pomocnicza = integer+1;
        }
        return pomocnicza+1;
    }
}