package fundamentals.introduction1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        System.out.println(a);
////        int b = input.nextFloat();
//        float c = input.nextFloat();
//        System.out.println(c);
//        float d = input.nextInt();
//        System.out.println(d);

//        // type-casting
//        int a = (int)(16.9f);
//        System.out.println(a);
//        int b = 356;
//        byte c = (byte)(b);
//        System.out.println(c);

        byte b = 40;
        int i = 10;
        char c = 'a';
        short s = 1234;
        float f = 123.123f;
        double d = 21.21321421421;
        double result = f*b + i/c - d*s;
        System.out.println(f*b + " + " + i/c + " - " + d*s);
        System.out.println(result);
    }
}
