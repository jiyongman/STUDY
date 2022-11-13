package boj;
import java.util.*;

public class BOJ21143 { // Magic Trick

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // the initial arrangement of the cards
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 1) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
        sc.close();
    }
}