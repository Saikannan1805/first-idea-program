package fundamentals.assignments.ass2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter P , R , T : ");
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();
        float SI = (p*r*t)/100;
        System.out.println("Simple Interest: " + SI);
    }
}
