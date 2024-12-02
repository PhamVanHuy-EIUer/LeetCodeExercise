package Week1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        System.out.println(numberOfLetter(letter));
        sc.close();
    }

    public static int numberOfLetter(String letter) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < letter.length(); i++) {
            if (!charSet.contains(letter.charAt(i))) {
                charSet.add(letter.charAt(i));
            }
        }
        return charSet.size();
    }
}
