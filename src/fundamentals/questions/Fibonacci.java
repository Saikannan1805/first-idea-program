package fundamentals.questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        // 0 1 1 2 3 5 8 13 21 34
        if (n==1){
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            for (int i = 3; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println(b);
        }
    }
}
