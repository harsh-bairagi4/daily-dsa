//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//1431. Kids With the Greatest Number of Candies

package harsh.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KidsCandies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int element = 0; element < arr.length; element++){
            arr[element] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number of extra-candies: ");
        int n = sc.nextInt();
        System.out.println((kidsWithCandies(arr, n)));
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++){
            if (candies[i]+extraCandies >= max){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
}
