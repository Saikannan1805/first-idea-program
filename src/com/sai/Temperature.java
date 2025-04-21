package com.sai;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter temp in F: ");
        Scanner input = new Scanner(System.in);
        float Ftemp = input.nextFloat();
        float Ctemp = (Ftemp - 32)*5/9 ;
        System.out.println("Temp in F is : " + Ctemp);
    }
}
