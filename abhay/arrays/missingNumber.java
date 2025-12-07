// 268. Missing Number
// https://leetcode.com/problems/missing-number/description/

package abhay.arrays;

public class missingNumber {

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,1};
        int missing = missingNumber(nums);
        System.out.println(missing);
    }
}
