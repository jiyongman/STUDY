package boj;
import java.util.*;

public class BOJ16446 { // Enigma

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        String crib = sc.next();
        int result = 0;

        for (int i = 0; i < message.length() - crib.length() + 1; i++) {
            int cnt = 0;

            for (int j = 0; j < crib.length(); j++) {
                if (message.charAt(i + j) != crib.charAt(j)) {
                    cnt++;
                }
            }

            if (cnt == crib.length()) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}