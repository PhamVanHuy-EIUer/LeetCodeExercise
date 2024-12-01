package Week1;
import java.util.Scanner;

public class ParolineNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindromeNumber(x));
        sc.close();
    }
    public static boolean isPalindromeNumber(int x) {
        int temp = Math.abs(x);
        // int k = 1;
        // if(x < 0){
        //     k = -1;
        // }
        int result = 0;
        while (temp != 0){
            int j = temp%10;
            result = result * 10 + j;
            temp /= 10;
        }
        return result == x ? true : false;
    }
}
