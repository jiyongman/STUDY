package boj;
import java.util.*;

public class BOJ6843 { // Anagram Checker

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 'A']++;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') {
                arr[str2.charAt(i) - 'A']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.println("Is not an anagram.");
                return;
            }
        }

        System.out.println("Is an anagram.");
        sc.close();
    }
}