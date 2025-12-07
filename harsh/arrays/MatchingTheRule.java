//https://leetcode.com/problems/count-items-matching-a-rule/description/
//1773. Count Items Matching a Rule

package sharma.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatchingTheRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        String[][] items = new String[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j< items[i].length; j++){
                items[i][j] = sc.next();
            }
        }
        for(String[] row: items) {
            System.out.println(Arrays.toString(row));
        }

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));

    }
    public static int countMatches(String[][] items, String ruleKey, String ruleValue) {

        int count;
        int value = 0;
        if(ruleKey.equals("type")){
            count = 0;
        } else if (ruleKey.equals("color")) {
            count = 1;
        }
        else {
            count = 2;
        }
        for (int i = 0; i < items.length; i++){
            if(items[i][count].equals(ruleValue)){
                value++;
            }
        }
        return value;

        /*
        In case of ArrayList:

        int count = 0;
        int index = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
        */

    }
}
