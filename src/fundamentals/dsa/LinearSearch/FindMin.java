package fundamentals.dsa.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] marks = { 12, -34, 54, -32, 222, -59 , 345 , 43,2,56 , 677, 22 , -34 , -56 ,-221};
        System.out.println("Minimum value is : " + Minimum(marks));
    }

    static int Minimum(int[] arr) {

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;

    }

}
