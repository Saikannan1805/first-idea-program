package fundamentals.assignments.ass1;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        //3. Take a number as input and print the multiplication table for it.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("How many values: ");
        int values = input.nextInt();
        for (int a = 1 ; a <= values ; a++) {
            int result = number * a ;
            System.out.println(number + " * " + a + " = " + result);
        }
    }
}
