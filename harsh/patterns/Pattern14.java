    //   **********
    //   ****  ****
    //   ***    ***
    //   **      **
    //   *        *
    //   *        *
    //   **      **
    //   ***    ***
    //   ****  ****
    //   **********
    
package harsh.patterns;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pattern14(n);
    }
    public static void pattern14(int n){
        for (int row = 0; row < 2*n; row++){
            int c = row < n ? n - row: row - n + 1 ;
            for (int col1 = 0; col1 < c; col1++){
                System.out.print("*");
            }
            for (int space = 0; space < (n-c)*2; space++){
                System.out.print(" ");
            }
            for (int col2 = 0; col2 < c; col2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
