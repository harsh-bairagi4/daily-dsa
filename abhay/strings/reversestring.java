// https://leetcode.com/problems/reverse-string/
// 344. Reverse String

package abhay.strings;

import java.util.Scanner;

public class reversestring {

    public static void reverseString(char[] s) {
        int n = s.length;
        int i = 0, j = n - 1;
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        reverseString(arr);
        System.out.println(arr);
    }
}
