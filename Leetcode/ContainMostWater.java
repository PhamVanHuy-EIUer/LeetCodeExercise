package Leetcode;
import java.util.Scanner;

public class ContainMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] height = new int[number];
        for (int i = 0; i < number; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(maxWater(height));
        sc.close();
    }

    public static Integer maxWater(int[] height) {
        int max = 0;
        int tempMax = 0;
        int i = 0;
        int j = height.length - 1;
        int h = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                tempMax = height[i] * (j - i);
                h = height[i];
                while (i < j && h >= height[i]) {
                    i++;
                }
            } else {
                tempMax = height[j] * (j - i);
                h = height[j];
                while (i < j && h >= height[j]) {
                    j--;
                }
            }
            max = max > tempMax ? max : tempMax;
        }
        return max;
    }
}
