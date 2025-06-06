package fundamentals.assignments.ass2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // 9. To find Armstrong Number between two given number.
        // Didn't Do
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start and end numbers: ");
        int start = input.nextInt();
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(num);
            }
        }
    }
}
