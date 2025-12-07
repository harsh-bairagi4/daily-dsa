//https://leetcode.com/problems/running-sum-of-1d-array/description/
//1480. Running Sum of 1d Array

package sharma.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums){
        int a = nums.length;
        int[] ans = new int[a];
        ans[0] = nums[0];
        for(int i = 1; i < a; i++){
            ans[i] = nums[i] + ans[i - 1];
        }
        return ans;
    }
}
