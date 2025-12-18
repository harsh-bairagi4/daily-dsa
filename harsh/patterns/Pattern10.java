    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *

package harsh.patterns;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern10(n);
    }
    public static void pattern10(int n){
        for (int row = 1; row <= n; row++){
            for(int space = 1; space<=n-row; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row  ; col++ ){
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
