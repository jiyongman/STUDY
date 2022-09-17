package boj;
import java.util.*;

public class BOJ14652 { // 나는 행복합니다~

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 세로 길이
        int M = sc.nextInt(); // 가로 길이
        int K = sc.nextInt(); // 잃어버린 관중석 번호

        System.out.println(K / M + " " + K % M);
        sc.close();
    }
}