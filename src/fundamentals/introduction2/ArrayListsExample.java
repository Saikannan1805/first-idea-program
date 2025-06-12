package fundamentals.introduction2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(2)); // list(index) will not work here


        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));;
        }


    }
}
