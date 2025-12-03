// https://leetcode.com/problems/valid-palindrome/description/
// 125. Valid Palindrome

package abhay.strings;

import java.util.Scanner;

class Test {

    public static boolean isPalindrome(String s) {
        char[] chArr = s.toLowerCase().toCharArray();

        int j = 0, k = chArr.length -1;
        boolean flag  = true;
        while(j < k){
            
            if(!Character.isLetterOrDigit(chArr[j])){
                j++;
            } else if(!Character.isLetterOrDigit(chArr[k])){
                k--;
            } else if(chArr[j] == chArr[k]){
                j++;
                k--;
            } else {
                flag = false;
                break;
            }
        }


        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
