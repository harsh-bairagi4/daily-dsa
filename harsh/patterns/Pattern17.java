    //    1
    //    0 1
    //    1 0 1
    //    0 1 0 1
    //    1 0 1 0 1
    
package harsh.patterns;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        pattern22(n);
    }
    static void pattern17(int n){


        for (int row = 1; row <=n; row++){
            int c = 1;
            if(row%2==0){
                c = 0;
            }
            for (int col = 1; col <= row; col++){
                System.out.print(c + " ");
                if(c == 0){
                    c = 1;
                }
                else{
                    c = 0;
                }

            }
            System.out.println();
        }
    }
}
