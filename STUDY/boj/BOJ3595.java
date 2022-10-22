package boj;
import java.util.*;

public class BOJ3595 { // 맥주 냉장고

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j > n) {
                    break;
                }
                for (int k = 1; k <= n; k++) {
                    if (i * j * k > n) {
                        break;
                    } else if (i * j * k < n) {
                        continue;
                    } else {
                        if (min > 2 * i * j + 2 * j * k + 2 * k * i) {
                            min = 2 * i * j + 2 * j * k + 2 * k * i;
                            a = i;
                            b = j;
                            c = k;
                        }
                    }
                }
            }
        }

        System.out.printf("%d %d %d", a, b, c);
        sc.close();
    }
}