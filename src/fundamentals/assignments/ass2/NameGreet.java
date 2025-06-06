package fundamentals.assignments.ass2;

import java.util.Scanner;

public class NameGreet {
    public static void main(String[] args) {
        // 2. Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello "+ name);

    }
}
