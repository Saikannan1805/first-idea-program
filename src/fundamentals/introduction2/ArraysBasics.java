package fundamentals.introduction2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Syntax
//        dataType[] variableName = new dataType[Size]
//        int[] rollNo = new int[5];
//        int[] rollNos = { 1 , 2 , 3 , 4 , 5 };

        int[] rollNo = new int[5];
//        rollNo[0] = 12134;
//        rollNo[1] = 23245;
//        rollNo[2] = 312;
//        rollNo[3] = 4124;
//        rollNo[4] = 523;

        // input using for-loop
        for (int i = 0 ; i < rollNo.length; i++) {
            rollNo[i] = input.nextInt();
        }

        for (int i = 0 ; i < rollNo.length; i++) {
            System.out.print(rollNo[i] + " ");
        }
        System.out.println(" ");
        // ⬆️ and ⬇️ are same !!!
        for (int elements : rollNo) {
            System.out.print(elements + " ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(rollNo));

//        String[] names = new String[5];
//
//        for (int i=0; i< names.length; i++) {
//            names[i] = input.next();
//        }
//
//        names[1] = "Sai";
//        System.out.println(Arrays.toString(names));

    }
}
