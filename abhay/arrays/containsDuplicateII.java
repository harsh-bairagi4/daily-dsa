// 219. Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/description/ 

import java.util.HashMap;

public class containsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int previousIndex = map.get(arr[i]);
                if(Math.abs(i - previousIndex) <= k){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,2,5,};
        int k = 6;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}
