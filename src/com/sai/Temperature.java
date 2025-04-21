package com.sai;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter temp in C: ");
        Scanner input = new Scanner(System.in);
        float Ctemp = input.nextFloat();
        float Ftemp = Ctemp*9/5 +32;
        System.out.println("Temp in F is : " + Ftemp);
    }
}
