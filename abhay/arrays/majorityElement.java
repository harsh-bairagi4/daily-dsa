package abhay.arrays;

public class majorityElement {

    public static int majorityElement(int[] nums) {
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

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int element = majorityElement(nums);
        System.out.println(element);
    }
}
