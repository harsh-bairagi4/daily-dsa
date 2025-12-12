// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/description/

public class mergeSortedArrays {

    public static void mergeSortedArrays(int[] arr1, int m, int[] arr2, int n){
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j]){
                arr1[k] = arr1[i];
                k--;
                i--;
            } else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }

        while (j >= 0) {
            arr1[k] = arr2[j];
            k--;
            j--;
        }

        for (int o : arr1) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,5,6,7,0,0,0,0,0};
        int[] arr2 = {2,3,4,5,6};
        int m = 5;
        int n = arr2.length;
        mergeSortedArrays(arr1, m, arr2, n);
    }
}
