package com.rajyawardhan.interceptor.arrays;

public class ArrayOperations {

    public static void sort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
                }
            }
        }
    }

    public static void sort(int[][] map) {
        int length = map.length;
        int[] temp;

        for (int i = 0; i < length; i++) {
            if (map[i][1] != 0) {
                for (int j = i; j < length; j++) {
                    if (map[i][1] > map[j][1]) {
                        temp = map[i];
                        map[i] = map[j];
                        map[j] = temp;
                    }
                }
            }
        }
    }

    public static void populateMap(int[] arr, int[][] map) {

        int currentMapIndex = 0;
        map[0][0] = arr[0];
        map[0][1] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                map[currentMapIndex][1] = map[currentMapIndex][1] + 1;
            } else {
                currentMapIndex++;
                map[currentMapIndex][0] = arr[i];
                map[currentMapIndex][1] = 1;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printMap(int[][] map) {
        for (int[] arr : map) {
            if (arr[1] != 0) {
                System.out.println(arr[0] + " " + arr[1]);
            }
        }
    }

    public static void printAsPerFrequency(int[][] map) {
        for (int[] arr: map) {
            for (int i = 0; i < arr[1]; i++) {
                System.out.print(arr[0]+" ");
            }
        }
    }
}
