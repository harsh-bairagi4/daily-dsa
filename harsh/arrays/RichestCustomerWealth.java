//https://leetcode.com/problems/richest-customer-wealth/description/
//1672. Richest Customer Wealth

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i = 0; i< accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
                accounts[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int[] arr: accounts){
            System.out.println(Arrays.toString((arr)));
        }
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {

        int max = 0;
        for (int[] arr : accounts){
            int sum = 0;
            for (int element: arr){
                sum += element;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
