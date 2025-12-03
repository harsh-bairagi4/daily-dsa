//https://leetcode.com/problems/transpose-matrix/description/
//867. Transpose Matrix

package sharma.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };
        for(int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }
        int[][] ans = transpose(matrix);
        for(int[] arr: ans){
            System.out.println(Arrays.toString(arr));
        }

    }
    public static int[][] transpose(int[][] matrix) {

        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length ; i++){
            for (int j = 0; j < matrix.length ; j++){
                transposed[i][j] = matrix[j][i];
            }
        }

        return transposed;
    }
}
