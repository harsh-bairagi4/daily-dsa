//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
//1704. Determine if String Halves Are Alike

package harsh.strings;

import java.util.Scanner;

public class StringHalves {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String a = s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2);

        int count = 0;
        int count2 = 0;
        for (int i = 0; i < a.length() && i < b.length(); i++){
            if(a.charAt(i) == 'a'  || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                count++;
            }
            if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u'){
                count2++;
            }
        }

        return count == count2;


    }
}
