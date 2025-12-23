// 11111
// 2222
// 333
// 44
// 5
package harsh.patterns;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pattern19(n);
    }
    static void pattern19(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 0; j <= n - i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
