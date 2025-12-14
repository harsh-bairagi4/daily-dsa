//https://leetcode.com/problems/reverse-prefix-of-word/description/
//2000. Reverse Prefix of Word

package harsh.strings;

import java.util.Scanner;

public class ReversePrefixWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();
        System.out.println(word);
        System.out.print("Enter the character: ");
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);
        System.out.println(reversePrefix(word, ch));
    }
    public static String reversePrefix(String word, char ch) {

        StringBuilder ans = new StringBuilder();
            if(word.indexOf(ch) != -1){
                for (int i = word.indexOf(ch); i>= 0; i--){
                    ans.append(word.charAt(i));
                }
                for (int i = word.indexOf(ch) + 1; i < word.length(); i++){
                    ans.append(word.charAt(i));
                }
                return ans.toString();
            }
            return word;

    }
}
