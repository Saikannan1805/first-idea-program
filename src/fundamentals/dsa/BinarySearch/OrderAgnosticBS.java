package fundamentals.dsa.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = { -10 , -8 , -6 , -4 , -2 , 0 , 2 , 4 , 6 , 8, 10}; // Sorted Array (Ascending)
        int[] arr2 = { 10 , 8 , 6 , 4 , 2 , 0 , -2 , -4 , -6 , -8, -10}; // Sorted Array (Descending)
        int target = 4;
        int ans1 = oaBinarySearch(arr1,target);
        System.out.println("Target is at index: " + ans1);
        int ans2 = oaBinarySearch(arr2,target);
        System.out.println("Target is at index: " + ans2);
    }
    static int oaBinarySearch(int[] arr ,int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start<=end) {
            int mid = start + (end-start)/2;
//        int mid = (start+end)/2; //start+end might exceed maximum value of int

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
