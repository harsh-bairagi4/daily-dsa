// 15. 3Sum
// https://leetcode.com/problems/3sum/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1, r = n-1;
            while(l < r){
                if(nums[i] + nums[r] + nums[l] == 0){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[r], nums[l]);
                    Collections.sort(triplet);
                    set.add(triplet);
                    r--;
                    l++;

                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                }
                else if(nums[i] + nums[r] + nums[l] > 0){
                    r--;
                } else {
                    l++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,0,2,2,1,-1,-2,-4};
        threeSum(nums);
    }
}
