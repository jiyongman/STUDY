package boj;
import java.util.*;

public class BOJ1773 { // 폭죽쇼

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 폭죽을 터뜨리는 학생의 수
        int C = sc.nextInt(); // 폭죽쇼가 끝나는 시간
        int[] arr = new int[N];
        int[] arr2 = new int[C + 1];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= C; j++) {
                if (j % arr[i] == 0) {
                    arr2[j]++;
                }
            }
        }

        int result = 0;

        for (int i = 1; i <= C; i++) {
            if (arr2[i] > 0) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}