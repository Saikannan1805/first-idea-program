package fundamentals.assignments.ass2;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        if ( a % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
