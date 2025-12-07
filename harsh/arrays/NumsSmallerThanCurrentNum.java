//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
//1365. How Many Numbers Are Smaller Than the Current Number

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumsSmallerThanCurrentNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent (int[] nums){
        int[] ans = new int[nums.length];


        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
               ans[i] = count;
        }

        return ans;
    }
}
