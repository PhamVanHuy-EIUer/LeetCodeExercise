package Week1;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        int[] number = { 1, 5, 10, 50, 100, 500, 1000 };
        String[] roman = { "I", "V", "X", "L", "C", "D", "M" };
        Scanner sc = new Scanner(System.in);
        String romanSymbol = sc.next();
        System.out.println(numberOfRoman(number, roman, romanSymbol));
        sc.close();
    }

    public static int numberOfRoman(int[] number, String[] roman, String romanSymbol) {
        // String valueBef = "";
        int x = -1;
        int result = 0;
        for (int i = romanSymbol.length() - 1; i >= 0 ; i--) {
            int j = 0;
            String temp = String.valueOf(romanSymbol.charAt(i));
            while (!temp.equals(roman[j]) && j < number.length - 1) {
                j++;
            }
            if(j < x){
                result -= number[j];
            }else{
            result += number[j];
            }
            // valueBef = temp;
            x = j;
        }
        return result;
    }
}
