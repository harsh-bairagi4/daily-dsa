//https://leetcode.com/problems/shuffle-string/description/
//1528. Shuffle String

package harsh.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shuffled string: ");
        String s = sc.next();
        System.out.print("Enter the elements of the indices array: ");
        int[] indices = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            indices[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(indices));
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder shuffled = new StringBuilder(s);

        for(int i = 0; i<indices.length; i++){

           shuffled.setCharAt(indices[i], s.charAt(i));
        }
        return shuffled.toString();
    }
}
