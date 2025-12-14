//https://leetcode.com/problems/excel-sheet-column-title/description/
//168. Excel Sheet Column Title

package harsh.strings;
import java.util.Scanner;

public class ExcelSheetCol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column number: ");
        int columnNumber = sc.nextInt();
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int num) {
        StringBuilder st=new StringBuilder();
        while(num>0)
        {
            int r=(num-1)%26;
            st.append((char)(r+'A'));
            num=(num-1)/26;
        }
        return st.reverse().toString();
    }
}
