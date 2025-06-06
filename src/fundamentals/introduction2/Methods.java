package fundamentals.introduction2;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        sum();

//        int sum = returnsum();
//        System.out.println("Sum is: "+sum);

//        greet();
//        System.out.println("Hello , "+ greet() );

        Scanner input = new Scanner(System.in);
        System.out.print("Enter favourite colo2r: ");
        String favColor = input.next();
        String personalised = myGreet("Saikannan" , 23 , favColor);
        System.out.println(personalised);


    }

    // 1
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = input.nextInt();
        System.out.print("Enter Number 2: ");
        int b = input.nextInt();
        int sum = a + b ;
        System.out.println("Sum is: "+sum);
    }

    // 2 (Return int value)
    static int returnsum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = input.nextInt();
        System.out.print("Enter Number 2: ");
        int b = input.nextInt();
        int sum = a + b ;
        return sum;
    }

    // 3 (Return String value)
    static String greet(){
        String greet = "Good Morning";
        return greet;
    }

    // 4 (Using Parameters)
    static String myGreet(String name, int age , String color) {
        String message = "Hello " + name + ", Age: " + age + " , Favourite Color: " + color;
        return message;
    }
}

