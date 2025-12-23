//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
package harsh.patterns;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern20(n);
    }
    static void pattern20(int n){
        for (int row = 1; row<2 * n; row++){
            int x = row >n? 2 * n - row: row;

            for (int space = 1; space <= n-x; space++){
                System.out.print(" ");
            }
            for (int col = 1; col<= x; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
