//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//1295. Find Numbers with Even Number of Digits

package harsh.arrays;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]  = sc.nextInt();
        }
        for (int e : arr){
            System.out.println(e);
        }

        int ans = 0;
        for (int i = 0; i < n; i++){
            int count = 0;
            while(arr[i] > 0){
                arr[i] /= 10;
                count++;
            }
            if(count % 2 == 0){
                ans++;
            }

        }
        System.out.println("The number of even number of digits are " + ans);
    }

}
