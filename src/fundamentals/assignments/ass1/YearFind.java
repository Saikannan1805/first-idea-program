package fundamentals.assignments.ass1;

import javax.xml.transform.Source;
import java.util.Scanner;

public class YearFind {
    public static void main(String[] args) {
        // 1. Input a year and find whether it is a leap year or not.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year % 100 == 0){
            System.out.println(year + " is not a Leap Year");
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}
