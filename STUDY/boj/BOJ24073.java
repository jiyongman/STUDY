package boj;
import java.util.*;

public class BOJ24073 { // ビ太郎と IOI (Bitaro and IOI)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (S.charAt(i) == 'I' && S.charAt(j) == 'O' && S.charAt(k) == 'I') {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");
        sc.close();
    }
}