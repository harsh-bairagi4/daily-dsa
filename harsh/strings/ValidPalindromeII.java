//https://leetcode.com/problems/valid-palindrome-ii/description/
//680. Valid Palindrome II

package harsh.strings;

import java.util.Scanner;

public class Valid_Palindrome_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be checked: ");
        String s = sc.next();
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // If characters match, move the pointers inward
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // Try skipping either the left character or the right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }

        // If no mismatches are found, it's already a palindrome
        return true;
    }

    // Helper method to check if a substring is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
