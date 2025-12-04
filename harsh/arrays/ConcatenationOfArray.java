//https://leetcode.com/problems/concatenation-of-array/description/
//1929. Concatenation of Array

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] nums = new int[a];
        for(int i = 0; i< a; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int [] nums){
        int a = nums.length;
        int b = 2 * a;
        int[] ans = new int[b];
        for(int i = 0; i < b; i++){
            ans[i] = nums[i%nums.length];
        }
        return ans;
    }
}
