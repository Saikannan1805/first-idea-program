package fundamentals.introduction1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println(num1);
        int num2 = input.nextInt();
        System.out.println(num2);
        int sum = num1 + num2;
        System.out.println("Sum:" + sum);
    }
}
