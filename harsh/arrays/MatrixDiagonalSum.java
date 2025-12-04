//https://leetcode.com/problems/matrix-diagonal-sum/description/
//1572. Matrix Diagonal Sum

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int[] arr: mat) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int k = mat.length - 1;
        while(i < mat.length) {
            sum += mat[i][j];
            if(j != k){
                sum += mat[i][k];
            }
            i++;
            j++;
            k--;
        }
        return sum;
    }
}

