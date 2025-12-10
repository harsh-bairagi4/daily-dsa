//https://leetcode.com/problems/reshape-the-matrix/description/
//566. Reshape the Matrix

package harsh.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Reshape_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for (int[] arr: mat){
            System.out.println(Arrays.toString(arr));
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] ans = matrixReshape(mat, r, c);
        for (int[] arr: ans){
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c){
            return mat;
        }

        int[][] ans  = new int[r][c];
        int i = 0;
        int j = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[row].length; col++){
                ans[i][j] = mat[row][col];
                j++;
                if (j == c) {
                    i++;
                    j = 0;
                }

            }
        }
        return ans;
    }
}
