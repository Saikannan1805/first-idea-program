package fundamentals.introduction2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        details(1,2,3,4,5,6);

        data(4 ,5 , "Sai" , "Kannan");
    }


    static void details ( int ...v ) {
        System.out.println(Arrays.toString(v  ));
    }

    static void data ( int a , int b , String ...x ) {

    }
}
