package boj;
import java.util.*;

public class BOJ24084 { // 次の文字 (Next Character)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the length of S
        String S = sc.next();

        for (int i = 1; i < N; i++) {
            if (S.charAt(i) == 'J') {
                System.out.println(S.charAt(i - 1));
            }
        }

        sc.close();
    }
}