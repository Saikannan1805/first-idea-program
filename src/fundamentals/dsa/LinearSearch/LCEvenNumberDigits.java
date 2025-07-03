package fundamentals.dsa.LinearSearch;

// 1295
public class LCEvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {555, 3333 , 22, 1};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int[] arr = nums;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int digitCount = 0;
            while (n > 0) {
                digitCount++;
                n = n/10;
            }
            if (digitCount % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

}