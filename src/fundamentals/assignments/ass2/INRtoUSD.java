package fundamentals.assignments.ass2;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value in INR: ");
        float rupee = input.nextFloat();
        float usd = rupee / 85;
        System.out.println("USD: " + usd);
    }
}
