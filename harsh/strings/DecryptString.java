//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
//1309. Decrypt String from Alphabet to Integer Mapping

package harsh.strings;
import java.util.Scanner;

public class DecryptString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();
        System.out.println(s);
        System.out.println(freqAlphabets(s));

    }
    public static String freqAlphabets(String s) {
        StringBuilder str= new StringBuilder();
        int k;
        for(int i = s.length()-1 ; i >= 0 ; i-- ) {
            if(s.charAt(i) == '#'){
                k = Integer.parseInt(s.substring(i - 2, i));
                i -= 2;
            } else {
                char ch = s.charAt(i);
                k = ch - '0';
            }
            k += 96;
            str.append((char) k);
        }
        return str.reverse().toString();
    }
}
