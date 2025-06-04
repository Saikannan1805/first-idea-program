package fundamentals.assignments.ass1;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        //4. Take 2 numbers as inputs and find their HCF and LCM.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        int hcf = 0;
        int lcm = 0;

        // Find Greatest number & set it to x , y
        if (num1 == num2){
            System.out.println("Same numbers inputted");
        } else if (num1 > num2) {
            x = num1;
            y = num2;
        } else {
            x = num2;
            y = num1;
        }

        // Check if x%y is 0
        // Yes => HCF is y
        // No => replace x with y and y with z. Check if x%y is 0 . Last non-zero remainder's Y is answer.

        if (x%y == 0) {
            hcf = y;
            System.out.println("HCF is: " + hcf);
        } else {
            z = x%y;
            while (z!=0){
                x = y;
                y = z;
                z = x%y;
                hcf = y;
            }
            System.out.println("HCF is: " + hcf);
        }

        // LCM
        lcm = num1 * num2 / hcf ;
        System.out.println("LCM is: " + lcm);
    }
}
