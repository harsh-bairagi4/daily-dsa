// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// 26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[i+1]=nums[j];
                i++;
            }
            
        }
        return i+1;
    }
}