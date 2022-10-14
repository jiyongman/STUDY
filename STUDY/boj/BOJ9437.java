package boj;
import java.util.*;

public class BOJ9437 { // 사라진 페이지 찾기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt(); // 탐구영역의 전체 페이지 수

            if (N == 0) {
                break;
            }

            int P = sc.nextInt(); // 선택된 한 페이지
            int[] arr = new int[3];
            arr[0] = N + 1 - P;

            if (P % 2 > 0) {
                arr[1] = P + 1;
                arr[2] = N + 1 - (P + 1);
            } else {
                arr[1] = P - 1;
                arr[2] = N + 1 - (P - 1);
            }

            Arrays.sort(arr);

            System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
        }

        sc.close();
    }
}