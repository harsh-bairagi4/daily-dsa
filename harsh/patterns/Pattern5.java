    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    
package harsh.patterns;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern5(n);
    }
    public static void pattern5(int n){
        for (int i = 1; i < 2 * n; i++){
            int c = i > n ? (2 * n) - i : i;
            for (int j = 1; j <= c; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
