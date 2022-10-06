package boj;
import java.util.*;

public class BOJ2484 { // 주사위 네개

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 참여하는 사람 수
        int[] arr = new int[4];
        int max = 0;

        for (int i = 0; i < N; i++) {
            int result = 0;

            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt(); // 사람들이 주사위를 던진 4개의 눈
            }

            Arrays.sort(arr);

            if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                result += 50000 + arr[0] * 5000;
            } else if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[1] == arr[2] && arr[2] == arr[3])) {
                result += 10000 + arr[1] * 1000;
            } else if ((arr[0] == arr[1] && arr[2] == arr[3])) {
                result += 2000 + arr[0] * 500 + arr[2] * 500;
            } else if (arr[0] == arr[1]) {
                result += 1000 + arr[0] * 100;
            } else if (arr[1] == arr[2]) {
                result += 1000 + arr[1] * 100;
            } else if (arr[2] == arr[3]) {
                result += 1000 + arr[2] * 100;
            } else {
                result += arr[3] * 100;
            }

            max = Math.max(max, result);
        }

        System.out.println(max);
        sc.close();
    }
}