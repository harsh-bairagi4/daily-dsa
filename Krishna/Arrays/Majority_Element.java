// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(cnt == 0){
                majority = nums[i];
            }
            if(nums[i] == majority){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return majority;
    }
}
