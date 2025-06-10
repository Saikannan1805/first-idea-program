package fundamentals.assignments.ass2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // 9. To find Armstrong Number between two given number.
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isArmstrong(num));

    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n % 10;
            sum = sum + (int)Math.pow(rem,digitCheck(original)) ;
            n = n/10;
        }

        return sum == original;

    }

    static int digitCheck (int number) {
        int digit = 1;
        for (int n=number; n>9 ; n=n/10) {
            digit++;
        }
        return digit;
    }
}
