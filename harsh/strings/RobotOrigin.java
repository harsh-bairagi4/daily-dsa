//https://leetcode.com/problems/robot-return-to-origin/description/
//657. Robot Return to Origin

package harsh.strings;

import java.util.Scanner;

public class RobotOrigin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the moves: ");
        String moves = sc.next();
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        moves = moves.toUpperCase();
        int numberofR = 0;
        int numberofL = 0;
        int numberofU = 0;
        int numberofD = 0;
        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'R'){
                numberofR++;
            }
            if (moves.charAt(i) == 'L'){
                numberofL++;
            }
            if (moves.charAt(i) == 'U'){
                numberofU++;
            }
            if (moves.charAt(i) == 'D'){
                numberofD++;
            }
        }
        return numberofR == numberofL && numberofD == numberofU;
    }
}
