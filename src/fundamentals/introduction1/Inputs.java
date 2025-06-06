package fundamentals.introduction1;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int rollno = input.nextInt();
//        System.out.println("Rolllno is: " + rollno);

        String name = input.nextLine();
        System.out.println(name);
    }
}
