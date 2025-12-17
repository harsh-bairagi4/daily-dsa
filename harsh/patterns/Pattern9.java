    // *********
    //  *******
    //   *****
    //    ***
    //     *
    
package harsh.patterns;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern9(n);
    }
    public static void pattern9(int n){
        int k = n - 1;
        for (int row = 0; row < n; row++){
            for (int space = 0; space< row; space++){
                System.out.print(" ");
            }
            for (int col = 0; col < n - row + k; col++){
                System.out.print("*");
            }
            System.out.println();
            k--;
        }
    }
}
