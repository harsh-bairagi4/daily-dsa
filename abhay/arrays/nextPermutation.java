// 31. Next Permutation
// https://leetcode.com/problems/next-permutation/description/

public class nextPermutation {

    public static void nextPermutation(int[] arr){
        int index = -1;
        int n = arr.length;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            int i = 0, j = n-1;
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }else {
            for(int i = n-1; i >= 0; i--){
                if(arr[i] > arr[index]){
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }

            int i = index + 1, j = n-1;
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        nextPermutation(arr);
    }
}
