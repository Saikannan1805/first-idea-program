package fundamentals.dsa.LinearSearch;

import java.util.Scanner;

public class LinearSearch_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = { 12, 34, 54, -32, 222, -59 , 345 , 43,2,56 , 677, 22 , -34 , -56 ,-221};
        int target = 54;
        int answer = linearSearch2(marks , target);
        System.out.println(answer);
    }

    // Return Index of target
    static int linearSearch1(int[] arr , int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }

    // Return Target
    static int linearSearch2(int[] arr , int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }

        return -1;
    }
}
