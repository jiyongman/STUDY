package boj;
import java.util.*;

public class BOJ24544 { // 카카오뷰 큐레이팅 효용성 분석

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 콘텐츠의 개수
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 콘텐츠의 흥미도
        }

        int sum = 0; // 전체 콘텐츠의 흥미도의 합
        int sum2 = 0; // My뷰에 등록되어있지 않은 콘텐츠들의 흥미도의 합

        for (int i = 0; i < N; i++) {
            int B = sc.nextInt(); // My뷰에 등록되어 있는지 여부
            sum += A[i];

            if (B == 0) {
                sum2 += A[i];
            }
        }

        System.out.println(sum);
        System.out.println(sum2);
        sc.close();
    }
}