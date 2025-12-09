//https://leetcode.com/problems/rotate-array/description/
//189. Rotate Array

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate (int[] nums, int k){
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[(i+k) % nums.length] = nums[i];
        }
        for (int i = 0; i < n; i++){
            nums[i] = ans[i];
        }
    }
}
