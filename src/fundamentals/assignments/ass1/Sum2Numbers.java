package fundamentals.assignments.ass1;

import java.util.Scanner;

public class Sum2Numbers {
    public static void main(String[] args) {
        //2. Take two numbers and print the sum of both.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float sum = a+b;
        System.out.println("Sum is: "+sum);
    }
}
