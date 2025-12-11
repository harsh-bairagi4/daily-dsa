//https://leetcode.com/problems/defanging-an-ip-address/description/
//1108. Defanging an IP Address

package harsh.strings;

import java.util.Scanner;

public class DefangingIPAddress {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the address: ");
        String address = sc.next();
        System.out.println(address);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i<address.length(); i++){
            if(address.charAt(i) == '.') {
                ans.append("[.]");
            }
            else{
                ans.append(address.charAt(i));
            }

        }
        System.out.println(ans);

    }
}
