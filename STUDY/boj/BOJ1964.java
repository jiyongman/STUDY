package boj;
import java.util.*;

public class BOJ1964 { // 오각형, 오각형, 오각형…

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // 단계
        long sum = 5 * (N * (N + 1) / 2) - (N * N - 1);
        long result = sum % 45678;

        System.out.println(result);
        sc.close();
    }
}