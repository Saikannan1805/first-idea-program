package fundamentals.dsa.LinearSearch;

import java.util.Arrays;

// 1672
public class LCRichCustomerWealth {
    public static void main(String[] args) {
        int[][] values = {
                {1,6,1}, //8
                {2,5,2}, //9
                {3,4,3}  //10
        };
        int ans = maximumWealth(values);
        System.out.println(ans);
    }

//    static int maximumWealth(int[][] accounts) {
//        int worth = 0;
//        int temp = 0;
//        for (int row = 0; row < accounts.length; row++) {
//            worth = Arrays.stream(accounts[row]).sum();
//            if (worth > temp){
//                temp = worth;
//            }
//        }
//        return temp;
//    }

    static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int row = 0; row < accounts.length; row++) {
            int worth = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                worth += accounts[row][col];
            }
            ans = Math.max(worth,ans);
        }
        return ans;
    }
}
