//https://leetcode.com/problems/sorting-the-sentence/description/
//1859. Sorting the Sentence

package harsh.strings;


import java.util.Scanner;


public class SortingSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the suffled sentence: ");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(sortSentence(s));

    }
    public static String sortSentence(String s) {

       String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        StringBuilder sb = new StringBuilder();

        int index;
        for (String value : arr) {
             index = value.charAt(value.length() - 1) - '0';
            res[index - 1] = value.substring(0, value.length() - 1);
        }
        for (index = 0; index < res.length - 1; index++){
            sb.append(res[index]).append(" ");
        }
        sb.append(res[index]);

        return sb.toString();
    }
}
