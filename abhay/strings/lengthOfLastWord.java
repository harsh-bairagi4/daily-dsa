// https://leetcode.com/problems/length-of-last-word/description/
// 58. Length of Last Word

package abhay.strings;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] strArray = s.trim().toLowerCase().split("\\s+");
        int n = strArray.length;
        char[] ch = strArray[n-1].toCharArray();
        int count = 0;
        for(char c : ch){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
