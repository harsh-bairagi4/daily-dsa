    //      1
    //     212
    //    32123
    //   4321234
    //    32123
    //     212
    //      1
    
package harsh.patterns;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pattern13(n);
    }
    static void pattern13(int n){
        for (int row = 1; row < 2 * n; row++){
            int c = row > n ? row - n: n - row;
            for (int space = 1; space<=c; space++){
                System.out.print(" ");
            }
            int z = row >n ? (2*n) - row : row;
            for (int col = z; col >= 1; col--){
                System.out.print(col);
            }
            for(int col2 = 2; col2<= z; col2++){
                System.out.print(col2);
            }
            System.out.println();
        }
    }
}
