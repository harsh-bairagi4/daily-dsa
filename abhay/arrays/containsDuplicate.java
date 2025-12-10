import java.util.*;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(!(set.add(arr[i])))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,8,8,7,6,4};
        System.out.println(containsDuplicate(arr));
    }
}
