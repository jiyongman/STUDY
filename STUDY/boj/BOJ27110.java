package boj;
import java.util.*;

public class BOJ27110 { // 특식 배부

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 주문한 각 종류의 치킨 마릿수
        int A = sc.nextInt(); // 후라이드 치킨을 가장 선호하는 병사의 수
        int B = sc.nextInt(); // 간장치킨을 가장 선호하는 병사의 수
        int C = sc.nextInt(); // 양념치킨을 가장 선호하는 병사의 수
        int sum = 0;

        sum += Math.min(A, N);
        sum += Math.min(B, N);
        sum += Math.min(C, N);

        System.out.println(sum);
        sc.close();
    }
}