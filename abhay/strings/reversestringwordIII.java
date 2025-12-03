// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
// 557. Reverse Words in a String III

package abhay.strings;

import java.util.Scanner;

public class reversestringwordIII {

    public static String reverse(String str){
        char[] chArr = str.toCharArray();
        int i = 0, j = chArr.length - 1;
        while(i <= j){
            char temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
            i++;
            j--;
        }

        return new String(chArr);
    }

    public static String reverseWords(String s) {
        String result = "";
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i++){
            result += reverse(strArr[i]);
            if(i != (strArr.length - 1))
                result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
}
