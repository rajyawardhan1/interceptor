package com.rajyawardhan.interceptor.arrays;

import static com.rajyawardhan.interceptor.arrays.ArrayOperations.*;

public class Runner {
    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 1, 3, 1, 2, 5};
        int[][] map = new int[arr.length][2];

        sort(arr);
        printArray(arr);
        populateMap(arr, map);
        sort(map);
        printMap(map);
        printAsPerFrequency(map);
    }
}
