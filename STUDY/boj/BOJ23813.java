package boj;
import java.util.*;

public class BOJ23813 { // 회전

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // 모든 자리의 숫자가 다른 정수
        int length = (int) (Math.log10(N) + 1);
        long sum = 0;
        long tmp = N;

        while (true) {
            long M = N % 10;
            N /= 10;
            N += M * Math.pow(10, length - 1);
            sum += N;

            if (tmp == N) {
                break;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}