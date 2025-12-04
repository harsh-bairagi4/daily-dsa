//https://leetcode.com/problems/find-the-highest-altitude/description/
//1732. Find the Highest Altitude

package harsh.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] gain = new int[n];
        for (int i = 0; i < n; i++){
            gain[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(gain));

        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = gain[0];
        for (int i = 1; i < n; i++){
            ans[i+1]= ans[i] + gain[i] ;
        }
        System.out.println(Arrays.toString(ans));
        int max = ans[0];
        for (int i = 1; i < n + 1; i++){
            if(ans[i] > max){
                max = ans[i];
            }
        }
        System.out.println(max);
    }
}
