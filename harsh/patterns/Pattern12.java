    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
package harsh.patterns;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern12(n);
    }
    public static void pattern12(int n){
        for (int i = 1; i <= 2 * n; i++){
            int c = i > n ? 2 * n - i +1: i;
            for (int space = 1; space<c; space++){
                System.out.print(" ");
            }
            int z = i > n ? i - n - 1: n - i;
            for (int j = 0; j <= z; j++){
                System.out.print("* " );
            }
            System.out.println();
        }

    }
}
