package fundamentals.introduction2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 1 , 22 , 3 , 44 , 5};

        //Swap values in an array
//        System.out.println(Arrays.toString(arr));
//        swap ( arr , 2 , 4 );
//        System.out.println(Arrays.toString(arr));

        // Find maximum value in an array
        System.out.println(maximum(arr));

        // Find maximum value within a range in an array
        System.out.println(maxWithinRange(arr , 1 , 3));

        // Reverse an array
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr , start , end);
            start++;
            end--;
        }
    }

    static int maxWithinRange(int[] arr , int start , int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr , int x , int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


}
