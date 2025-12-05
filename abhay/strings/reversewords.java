// https://leetcode.com/problems/reverse-words-in-a-string/description/
// 151. Reverse Words in a String

package abhay.strings;

class reversewords {

    public static String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        int i = 0, j = strArr.length-1;
        String result = "";
        while(i <= j){
            String temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
            i++;
            j--;
        }
        for(int k = 0; k < strArr.length; k++){
            if(k == 0)
                result += strArr[k];
            else
                result  = result + " " + strArr[k];
        }
        return result;
    }

    public static void main(String[] args) {
        String s = " the world    is   beautiful";
        System.out.println(reverseWords(s));
    }
}