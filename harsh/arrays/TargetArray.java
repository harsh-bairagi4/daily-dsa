//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
//1389. Create Target Array in the Given Order

package harsh.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
        System.out.println(Arrays.toString((createTargetArray(nums, index))));
    }
    public static int[] createTargetArray(int[] nums, int[] index){

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < index.length; i++){
            list.add(index[i], nums[i]);
        }
        int target[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            target[i] = list.get(i);
        }
        return target;
    }
}
