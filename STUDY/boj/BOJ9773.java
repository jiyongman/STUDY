package boj;
import java.util.*;

public class BOJ9773 { // ID Key

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            char[] digits = sc.next().toCharArray();
            int sum = 0;

            for (int j = 0; j < 13; j++) {
                sum += digits[j] - '0';
            }

            int tmp = ((digits[10] - '0') * 100 + (digits[11] - '0') * 10 + (digits[12] - '0')) * 10;
            int key = sum + tmp;

            if (key < 1000) {
                key += 1000;
            } else if (key > 9999) {
                key -= 10000;
            }

            System.out.printf("%04d\n", key);
        }

        sc.close();
    }
}