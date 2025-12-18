//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
package harsh.patterns;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern11(n);
    }
    public static void pattern11(int n){
        for (int i = 0; i < n; i++){
            for(int space = 0; space < i; space++){
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
