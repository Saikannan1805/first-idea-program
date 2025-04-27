package fundamentals.questions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = 0;
        while( a > 0 ) {
            int rem = a % 10;
            c = rem + c*10 ;
            a = a/10;
        }
        System.out.println(c);

    }

}
