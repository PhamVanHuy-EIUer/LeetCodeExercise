package Week1;

import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        int [] number = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String [] symbolRoman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(RomanSymbol(number, symbolRoman, x));
        sc.close();
    }
    public static String RomanSymbol(int [] number, String [] symbolRoman, int x ){
        StringBuilder sb = new StringBuilder();
        int i = symbolRoman.length - 1;
        int temp = 0;
        while (x != 0){
            if(number[i] <= x){
                temp = x / number[i];
                for(int j = 1; j <= temp; j++){
                    sb.append(symbolRoman[i]);
                }
                x -= (number[i] *temp);
            }else{
                i--;
            }
        }
        return sb.toString();
    }
}
