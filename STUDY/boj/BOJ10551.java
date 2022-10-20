package boj;
import java.util.*;

public class BOJ10551 { // STROJOPIS

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = {"1QAZ", "2WSX", "3EDC", "4RFV5TGB", "6YHN7UJM", "8IK,", "9OL.", "0P;/-['=]"};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length(); k++) {
                    if (str.charAt(i) == arr[j].charAt(k)) {
                        arr2[j]++;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }

        sc.close();
    }
}