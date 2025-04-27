package fundamentals.questions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q: Find case type of char in a string
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch+" Lowercase");
        } else {
            System.out.println(ch + " Uppercase");
        }
    }
}
