package boj;
import java.util.*;

public class BOJ21734 { // SMUPC의 등장

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next(); // 알파벳 소문자로만 이루어진 단어

        for (int i = 0; i < S.length(); i++) {
            int tmp = S.charAt(i);
            int sum = 0;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            for (int j = 0; j < sum; j++) {
                System.out.print(S.charAt(i));
            }

            System.out.println();
        }

        sc.close();
    }
}