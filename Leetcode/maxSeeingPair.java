package Leetcode;

import java.util.Scanner;

public class maxSeeingPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = sc.nextInt();
        }
        int output = maxScoreSightSeeingPair(values);
        System.out.println(output);
        sc.close();
    }

    public static int maxScoreSightSeeingPair(int[] values) {
        int first = values[0];
        int max = 0;
        for (int i = 1; i < values.length; i++) {
            if (first + values[i] - i > max) {
                max = first + values[i] - i;
            }
            if(first < values[i] + i){
                first = values[i] + i;
            }
        }

        return max;
    }
    
}
