package Leetcode;
import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isIntegerNumber(s));
        sc.close();
    }

    public static Integer isIntegerNumber(String s) {
        int result = 0;
        int i = 0;
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        boolean negative = (s.charAt(0) == '-');
        boolean positive = (s.charAt(0) == '+');
        if (negative || positive) {
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result =result * 10 + digit;
            i++;
        }
        return negative ? -result : result;
        // while (i < s.length() && Character.isDigit(s.charAt(i))) {
        // valueAfter += s.charAt(i);
        // i++;
        // }
        // if (valueAfter == "") {
        // return 0;
        // }
        // try {
        // long x = negative ? -Long.parseLong(valueAfter) : Long.parseLong(valueAfter);
        // if (x > Integer.MAX_VALUE) {
        // return Integer.MAX_VALUE;
        // }
        // if (x < Integer.MIN_VALUE) {
        // return Integer.MIN_VALUE;
        // }
        // return (int) x;
        // } catch (NumberFormatException e) {
        // return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        // }
    }
}
