package fundamentals.questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter a operator: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();
                if (op == '+') {
                    ans = a + b;
                } else if (op == '-') {
                    ans = a - b;
                } else if (op == '*') {
                    ans = a * b;
                } else if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    } else {
                        System.out.println("Denominator is Zero");
                        ans = 0;
                    }
                } else if (op == '%') {
                    if (b != 0) {
                        ans = a % b;
                    } else {
                        System.out.println("Denominator is Zero");
                        ans = 0;
                    }
                }
                System.out.println(ans);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
            }
        }
    }
}
