package fundamentals.introduction2;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        //[Rows][Columns] Specifying rows is a must. (Column is optional)
        int[][] arr0 = new int[3][];

        int[][] arr1 = {
                { 1 , 2 , 3 },
                { 4 , 5 , 6 },
                { 7 , 8 , 9 }
        };

        int[][] arr2 = {
                { 1 , 2 , 3 },
                { 4 , 5 , 6 , 12 , 13},
                { 7 , 8 , 9 , 15}
        };

//        System.out.println(arr1[1][2]);
//        System.out.println(arr2[1][4]);
//        System.out.println(Arrays.toString(arr2[1]));

        int[][] arr3 = new int[3][2];
        for (int row = 0 ; row < arr3.length; row++) {
            for (int col = 0 ; col < arr3[row].length; col++) {
                arr3[row][col] = input.nextInt();
            }
        }
        for (int row = 0 ; row < arr3.length; row++) {
            for (int col = 0 ; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0 ; row < 3 ; row++) {
            System.out.println(Arrays.toString(arr3[row]));
        }
        System.out.println();
        for(int[] elements:arr3) {
            System.out.println(Arrays.toString(elements));
        }


    }
}
