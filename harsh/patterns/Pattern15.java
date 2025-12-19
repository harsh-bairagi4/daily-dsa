    //    *        *
    //    **      **
    //    ***    ***
    //    ****  ****
    //    **********
    //    ****  ****
    //    ***    ***
    //    **      **
    //    *        *

package harsh.patterns;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern15(n);
    }
    public static void pattern15(int n){
        for (int i = 1; i < 2 * n; i++){
            int c = i > n ? (2 * n) - i : i;
            for (int j = 1; j <= c; j++){
                System.out.print("*");
            }
            for (int space = 1; space <= (2*n) - (2*c) ; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
