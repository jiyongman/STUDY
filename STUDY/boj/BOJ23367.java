package boj;
import java.util.*;

public class BOJ23367 { // Dickensian Dictionary

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String left = "qwertasdfgzxcvb";
        String right = "yuiophjklnm";
        int cnt = 0;
        int cnt2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < left.length(); j++) {
                    if (str.charAt(i) == left.charAt(j)) {
                        cnt++;
                    }
                }
                for (int j = 0; j < right.length(); j++) {
                    if (str.charAt(i) == right.charAt(j)) {
                        cnt2++;
                    }
                }
            } else {
                for (int j = 0; j < right.length(); j++) {
                    if (str.charAt(i) == right.charAt(j)) {
                        cnt++;
                    }
                }
                for (int j = 0; j < left.length(); j++) {
                    if (str.charAt(i) == left.charAt(j)) {
                        cnt2++;
                    }
                }
            }
        }

        if (cnt == str.length() || cnt2 == str.length()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}