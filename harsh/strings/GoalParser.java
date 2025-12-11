//https://leetcode.com/problems/goal-parser-interpretation/description/
//1678. Goal Parser Interpretation

package harsh.strings;

public class GoalParser {
    public static void main(String[] args){
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
        System.out.println(command);
    }
    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder();
       for (int i = 0; i < command.length(); i++){
           if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
               ans.append("o");
           }if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
               ans.append("al");
           }
           if (command.charAt(i) == 'G'){
               ans.append("G");
           }

       }
       return ans.toString();

    }
}
