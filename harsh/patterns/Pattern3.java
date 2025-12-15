    // *****
    // ****
    // ***
    // **
    // *

package harsh.patterns;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern3(n);
    }
    public static void pattern3(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
