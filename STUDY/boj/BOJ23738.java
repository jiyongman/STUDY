package boj;
import java.util.*;

public class BOJ23738 { // Ресторан

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = {"A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"};
        String[] arr2 = {"a", "v", "ye", "k", "m", "n", "o", "r", "s", "t", "u", "h"};

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (str.charAt(i) == arr[j].charAt(0)) {
                    System.out.print(arr2[j]);
                }
            }
        }

        sc.close();
    }
}