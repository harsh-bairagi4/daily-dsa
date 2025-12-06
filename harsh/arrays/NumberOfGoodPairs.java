//https://leetcode.com/problems/number-of-good-pairs/description/
//1512. Number of Good Pairs

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++){
        for (int j = i + 1; j < nums.length; j++){
            if (nums[i] == nums[j]){
                count++;
            }
        }
    }
    return count;
    }
}
