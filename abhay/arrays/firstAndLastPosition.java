package abhay.arrays;

import java.util.Arrays;

public class firstAndLastPosition {


    public static int[] firstAndLastPosition(int[] arr, int target){
        int[] result = {-1, -1};
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(low < n && arr[low] == target){
            result[0] = low;
        }else{
            return result;
        }

        high = n - 1;

        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] <= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        result[1] = high;
        return result;
        }

    public static void main(String[] args) {
        int arr[] = {1,2,2,55,55,66,66};
        int target = 55;
        int[] result = firstAndLastPosition(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
