package fundamentals.dsa.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] arr = {
                {1,2,3},
                {4,5,6,7,8},
                {9,10,11},
                {12,13}
        };

        int target = 13;
        int[] ans = Search(arr , target);
        System.out.println("Target is at index : " + Arrays.toString(ans));
        System.out.println("Maximum value in array is : " + FindMax(arr));
    }

    static int[] Search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1 , -1};
    }

    static int FindMax(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
