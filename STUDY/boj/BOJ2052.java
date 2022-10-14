package boj;
import java.math.BigDecimal;
import java.util.*;

public class BOJ2052 { // 지수연산

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigDecimal A = BigDecimal.ONE;
        BigDecimal B = new BigDecimal(2);

        for (int i = 0; i < N; i++) {
            A = A.divide(B);
        }

        System.out.println(A.toPlainString());
        sc.close();
    }
}