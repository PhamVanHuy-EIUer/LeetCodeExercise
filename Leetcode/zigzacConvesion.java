package Leetcode;
import java.util.Scanner;

public class zigzacConvesion {
    public static void main(String[] args) {
        // ArrayList<String> output = new ArrayList<>()
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        int numRows = sc.nextInt();
        if (numRows >= letter.length()) {
            System.out.println(letter);
        } else {
            String output = "";
            int x = 0;

            if (numRows == 1) {
                x = 1;
            } else {
                x = (numRows - 1) * 2;
            }
            int k = x - 2;
            int i = 0;
            // if (letter.length() > 0) {
            while (i < numRows && letter.length() >= numRows) {
                output += letter.charAt(i);
                if (i > 0 && i < numRows - 1 && i + k < letter.length()) {
                    output += letter.charAt(i + k);
                }
                int j = i;
                while (j + x <= letter.length() - 1) {
                    if (i > 0 && i < numRows - 1) {
                        output += letter.charAt(j + x);
                        if (j + x + k < letter.length()) {
                            output += letter.charAt(j + x + k);
                        }
                    } else {
                        output += letter.charAt(j + x);
                    }
                    j += x;
                }

                if (i > 0 && i < numRows - 1) {
                    k -= 2;
                }
                i++;
            }
            System.out.println(output);
        }
        sc.close();
    }
}
