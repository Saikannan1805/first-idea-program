package fundamentals.dsa.BinarySearch;

public class BinarySearch_01 {
    public static void main(String[] args) {
        int[] arr1 = { -10 , -8 , -6 , -4 , -2 , 0 , 2 , 4 , 6 , 8, 10}; // Sorted Array (Ascending)
        int target = 4;
        int ans = BinarySearch(arr1,target);
        System.out.println("Target is at index: " + ans);
    }

    static int BinarySearch(int[] arr ,int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
//        int mid = (start+end)/2; //start+end might exceed maximum value of int
            if (target< arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
