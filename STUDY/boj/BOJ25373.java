package boj;
import java.util.*;

public class BOJ25373 { // 벼락치기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long result = 1;

        if (N < 28) {
            while (N > result * (result + 1) / 2) {
                result++;
            }
        } else {
            if (N % 7 == 0) {
                result = N / 7 + 3;
            } else {
                result = N / 7 + 4;
            }
        }

        System.out.println(result);
        sc.close();
    }
}