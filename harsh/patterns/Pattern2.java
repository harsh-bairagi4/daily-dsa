    // *
    // **
    // ***
    // ****
    // *****

package harsh.patterns;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern2(n);

    }
    public static void pattern2(int n){
        for (int i = 0 ; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
  