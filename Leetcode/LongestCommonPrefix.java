package Leetcode;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] strs = new String[number];
        for (int i = 0; i < number; i++) {
            strs[i] = sc.next();
        }
        String ouput = longestCommonPrefix(strs);
        System.out.println(ouput);
        sc.close();
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs == null){
            return "";
        }
        String checkStrs = strs[0];
        int x = checkStrs.length();
        for(int i = 1; i < strs.length; i++){
            while(x > strs[i].length() || !checkStrs.equals(strs[i].substring(0, x))){
                x--;
                if(x == 0){
                    return "";
                }
                checkStrs = checkStrs.substring(0, x);
            }
        }
        return checkStrs;
    }
}
