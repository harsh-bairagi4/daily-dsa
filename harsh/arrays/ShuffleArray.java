//https://leetcode.com/problems/shuffle-the-array/description/
//1470. Shuffle the Array

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 1, 3, 4, 7};
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    public static int[] shuffle(int[] nums, int n){
        int a = nums.length;
        int[] ans = new int[a];
        int i = 0;
        int j = n;
        int k = 0;
        while (i < n && j < a){
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            i++;
            j++;
            k += 2;
        }
        return ans;
    }
}
