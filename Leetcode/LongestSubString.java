package Leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        System.out.println(longestSubString(letter));
        sc.close();
    }
    public static int longestSubString(String letter){
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int right = 0; right < letter.length(); right++){
            if(!charSet.contains(letter.charAt(right))){
                charSet.add(letter.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }else{
                while (charSet.contains(letter.charAt(right))){
                    charSet.remove(letter.charAt(left));
                    left++;
                }
                charSet.add(letter.charAt(right));
            }
        }
        return maxLength;
    }
}
