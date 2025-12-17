//     1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5

package harsh.patterns;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern4(n);
    }
    public static void pattern4(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
