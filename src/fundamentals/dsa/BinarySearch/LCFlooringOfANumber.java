package fundamentals.dsa.BinarySearch;

// Find the smallest number greater than or equal to target
public class LCFlooringOfANumber {
    public static void main(String[] args) {
        int[] arr1 = { 0 , 2 , 4 , 6 , 8, 10}; // Sorted Array (Ascending)
        int target = 5;
        int ans = Flooring(arr1,target);
        System.out.println("Target is at index: " + ans);
        System.out.println("Smallest number greater than or equal to target: " + arr1[ans]);
    }

    static int Flooring(int[] arr , int target) {

        if (target < arr[0] || target > arr[arr.length-1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target< arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}