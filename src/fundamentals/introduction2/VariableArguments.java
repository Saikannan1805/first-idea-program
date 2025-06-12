package fundamentals.introduction2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        details(1,2,3,4,5,6);

        data(4 ,5 , "Sai" , "Kannan");

        // Method
        int ans1 = sum(4 ,5);
        int ans2 = sum(4 , 5 , 6);
        System.out.println(ans1);
        System.out.println(ans2);
    }


    static void details ( int ...v ) {
        System.out.println(Arrays.toString(v  ));
    }

    static void data ( int a , int b , String ...x ) {

    }

    static int sum(int a , int b) {
        return a + b;
    }

    static int sum(int a , int b , int c) {
        return a + b + c;
    }

}
