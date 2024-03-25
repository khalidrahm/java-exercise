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
        int[] sorteid = sortArray(arr, direction);
        System.out.println(Arrays.toString(sorteid));

    }
    public static int[] sortArray(int[] arr, String dir){
        int[] sorteyd = Arrays.copyOf(arr, arr.length);

        if (dir.equals("desc")) {
            return descOrder(sorteyd);
        } else if (dir.equals("asc")) {
            return ascOrder(sorteyd);
        }
        return sorteyd;
    }

    public static int[] descOrder(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }
    public static int[] ascOrder(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }
}
