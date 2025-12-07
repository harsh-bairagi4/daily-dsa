//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
//1832. Check if the Sentence Is Pangram

package harsh.arrays;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        System.out.println(sentence.toLowerCase());
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram (String sentence) {

        boolean[] array = new boolean[26];

        for (int i = 0; i < sentence.length(); i++){
            char c = sentence.trim().charAt(i);
            if(c >= 'a' && c <= 'z'){
                array[c - 'a'] = true;
            }
        }
        for(boolean element : array){
            if(!element){
                return false;
            }
        }
        return true;

        //Good approach
        /*
         if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
         */
    }
}
