//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
//1252. Cells with Odd Values in a Matrix

package harsh.arrays ;

import java.util.Arrays;
import java.util.Scanner;

public class OddValuesInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int[] e : arr){
            System.out.println(Arrays.toString(e));
        }
        System.out.print("Enter the indices array length: ");
        int r = sc.nextInt();
        System.out.print("Enter the indices column length: ");
        int c = sc.nextInt();
        int[][] indices = new int[r][c];
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                indices[i][j] = sc.nextInt();
            }
        }
        for(int[] e : indices){
            System.out.println(Arrays.toString(e));
        }
        int rowIndex = 0;
        int columnIndex = 0;
        for (int i = 0; i < indices.length; i++){
            for (int j = 0; j < indices[i].length - 1; j++){
                rowIndex = indices[i][j];
                columnIndex = indices[i][j + 1];
            }
            for (int k = 0; k < arr[rowIndex].length; k++){
                arr[rowIndex][k] += 1;
            }
            for (int l = 0; l < arr.length; l++){
                arr[l][columnIndex] += 1;
            }
        }
        for(int[] e : arr){
            System.out.println(Arrays.toString(e));
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}
