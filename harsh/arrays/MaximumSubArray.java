//https://leetcode.com/problems/maximum-subarray/description/
//53. Maximum Subarray

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int ans = 0;
            for (int j = 0; j < nums.length; j++){
                ans += nums[j];
                if(ans> max){
                    max = ans;
                }
                if(ans < 0){
                    ans = 0;
                }
            }
        return max;
    }
}
