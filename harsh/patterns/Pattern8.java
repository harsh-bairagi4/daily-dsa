    //     *
    //    ***
    //   *****
    //  *******
    // *********

package harsh.patterns;
import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern8(n);
    }
    public static void pattern8(int n){
        int k = 0;
        for (int i = 0; i < n; i++){
            for (int space = 1; space < n - i; space++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i + k; j++){
                System.out.print("*");
            }
            System.out.println();
            k++;
        }
    }
}
