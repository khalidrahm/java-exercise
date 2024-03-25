package com.adepuu.exercises.session5;
import java.util.Arrays;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc"
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc"
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        int[] arr = {8,7,5,2,3};
        String direction = "asc";
        int[] sorted = sortArray(arr, direction);
        System.out.println(Arrays.toString(sorted));

    }
    public static int[] sortArray(int[] arr, String dir){
        int[] sorted = new int[arr.length];
        System.arraycopy(arr, 0, sorted, 0, arr.length); // Copy the original array to avoid modification
        if (dir.equals("desc")) {
            descOrder(sorted);
        } else if (dir.equals("asc")) {
            ascOrder(sorted);
        }
        return sorted;
    }

    public static void descOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void ascOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
