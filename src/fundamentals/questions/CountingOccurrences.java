package fundamentals.questions;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q: 17939879078 => count the no.of.occurrences of 7 => Ans 3

        long a = input.nextLong();
        int count = 0;

        while (a > 0) {
            long rem = a % 10;
            if (rem == 7) {
                count++ ;
            }
            a = a/10;
        }
        System.out.println(count);

    }
}
