package fundamentals.assignments.ass1;

import java.util.Scanner;

public class SumallTillX {
    public static void main(String[] args) {
        // 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number: ");
        while (true) {
            char a = input.next().trim().charAt(0);
            if ( a =='x' || a =='X'){
                break;
            } else {
                int b  = Character.getNumericValue(a);
                sum = sum + b;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
