    // *****
    // *****
    // *****
    // *****
    // *****

package harsh.patterns;
import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern1(n);
    }
    public static void pattern1(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
