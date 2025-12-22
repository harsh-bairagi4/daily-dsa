    //       *****
    //      *   *
    //     *   *
    //    *   *
    //   *****
    
package harsh.patterns;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        pattern25(n);
    }
    static void pattern18(int n){
        for (int row = 0; row < n; row++){

            for (int space = 1; space < n - row; space++){
                System.out.print(" ");
            }
            if (row == 0 || row == n - 1){
                System.out.println("*****");
            }
            else{
                System.out.println("*   *");
            }

        }
    }
}
