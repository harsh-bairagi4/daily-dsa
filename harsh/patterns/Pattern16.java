    //    1
    //    2  3
    //    4  5  6
    //    7  8  9  10
    //    11 12 13 14 15
    
package sharma.patterns;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern21(n);
    }
    static void pattern16(int n){
        int count = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if(count<10){
                    System.out.print(count +"  ");
                }
                else{
                    System.out.print(count + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
