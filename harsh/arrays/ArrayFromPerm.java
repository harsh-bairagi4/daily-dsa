//https://leetcode.com/problems/build-array-from-permutation/description/
//1920. Build Array from Permutation

package sharma.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPerm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(buildArray(arr)));
            System.out.println(Arrays.toString(arr));

    }
    public static int[] buildArray(int[] arr){
        int n = arr.length;
        int[] nums = new int[n];
        for(int i = 0; i< n; i++){
            nums[i] = arr[arr[i]];
        }
        return nums;
    }
}
