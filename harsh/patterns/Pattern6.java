    //      *
    //     **
    //    ***
    //   ****
    //  *****
    
package harsh.patterns;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern6(n);
    }
    public static void pattern6(int n){
        for (int i = 0; i <n; i++){
            for (int space = 0; space < n - i; space++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
