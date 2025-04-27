package fundamentals.questions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q: Find largest of three numbers

//        // Ans 1
//        if ( a > b && a > c) {
//            System.out.println(a);
//        } else if (b > a && b > c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }

//        // Ans 2
//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // Ans 3
        int max = Math.max(a,Math.max(b,c));
        System.out.println(max);


    }
}
