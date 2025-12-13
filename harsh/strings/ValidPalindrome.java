//https://leetcode.com/problems/valid-palindrome/description/
//125. Valid Palindrome

package harsh.strings;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the phrase: ");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if(('a' <= s.charAt(i) && s.charAt(i) <= 'z') || ('0' <= s.charAt(i) && s.charAt(i) <= '9')){
                ans.append(s.charAt(i));
            }
        }
        String a = ans.toString();
        String b = ans.reverse().toString();
        return a.equals(b);
    }
}
