package fundamentals.assignments.ass2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 7. To calculate Fibonacci Series up to n numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        // 0 1 1 2 3 5 8
        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            for (int i = 3; i <= n ; i++){
                sum = a + b ;
                a = b;
                b = sum;
            }
            System.out.println("Answer: "+sum);
        }
    }
}
