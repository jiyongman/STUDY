package boj;
import java.util.*;

public class BOJ25785 { // Easy-to-Pronounce Words

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;

        for (int i = 1; i < str.length(); i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    if (str.charAt(i - 1) != 'a' && str.charAt(i - 1) != 'e' && str.charAt(i - 1) != 'i' && str.charAt(i - 1) != 'o' && str.charAt(i - 1) != 'u') {
                        cnt++;
                    }
                } else {
                    if (str.charAt(i - 1) == 'a' || str.charAt(i - 1) == 'e' || str.charAt(i - 1) == 'i' || str.charAt(i - 1) == 'o' || str.charAt(i - 1) == 'u') {
                        cnt++;
                    }
                }
            } else {
                if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                    if (str.charAt(i - 1) == 'a' || str.charAt(i - 1) == 'e' || str.charAt(i - 1) == 'i' || str.charAt(i - 1) == 'o' || str.charAt(i - 1) == 'u') {
                        cnt++;
                    }
                } else {
                    if (str.charAt(i - 1) != 'a' && str.charAt(i - 1) != 'e' && str.charAt(i - 1) != 'i' && str.charAt(i - 1) != 'o' && str.charAt(i - 1) != 'u') {
                        cnt++;
                    }
                }
            }
        }

        if (cnt == str.length() - 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}