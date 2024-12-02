package Week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] number = new int[n];
        for(int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(findTwoSum(number, target)));
        sc.close();
    }
    public static int [] findTwoSum(int [] number, int target){
        HashMap<Integer, Integer> savedValue = new HashMap<>();
        for(int i = 0; i < number.length; i++){
            int complement = target - number[i];
            if(savedValue.containsKey(complement)){
                return new int[]{savedValue.get(complement) , i};
            }
            savedValue.put(number[i], i);
        }
        return new int[] {-1,-1};
    }
}
 