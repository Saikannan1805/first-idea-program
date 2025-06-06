package fundamentals.assignments.ass2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // 8. To find out whether the given String is Palindrome or not.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palandrome or not: ");
        String str = input.next().trim();
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
//            System.out.println(rev);
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palandrome !!!");
        } else {
            System.out.println("Not a Palandorm !");
        }
    }
}
