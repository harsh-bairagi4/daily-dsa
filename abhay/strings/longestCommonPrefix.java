// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/description/

package abhay.strings;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs){
        String result = "";

        int k = 0;

        while(k < strs[0].length()){
            result+= strs[0].charAt(k);
            for(int i = 1; i < strs.length; i++){
                if(!(strs[i].startsWith(result))){
                    return result.substring(0, result.length()-1);
                }
            }
            k++;
        }

        return result;
    } 

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
