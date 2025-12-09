//https://leetcode.com/problems/flipping-an-image/description/
//832. Flipping an Image

package harsh.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class FlippingAnImage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[][] image = new int[n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                image[i][j] = sc.nextInt();
            }
        }
        for(int[] arr : image){
            System.out.println(Arrays.toString(arr));
        }
        int[][] ans = flipAndInvertImage(image);
        for (int[] arr : ans){
            System.out.println(Arrays.toString(arr));
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < (n + 1)/2; j++){
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n-j-1] ^ 1;
                image[i][n-j-1] = temp;
            }
        }
        return image;
    }
}
