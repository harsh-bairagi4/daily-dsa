//     1
//    212
//   32123
//  4321234
// 543212345
package harsh.patterns;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        pattern21(n);
    }
    static void pattern21(int n){
        for (int row = 1 ; row <= n; row++){
            for (int space = row; space < n; space++){
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col);
            }
            for (int col2 = 2; col2<= row; col2++){
                System.out.print(col2);
            }
            System.out.println();
        }
    }
}
