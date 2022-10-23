package boj;
import java.util.*;

public class BOJ23292 { // 코딩 바이오리듬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 사람의 생년월일
        int N = sc.nextInt(); // 그 사람이 코딩할 날짜의 일수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 코딩할 날짜
        }

        Arrays.sort(arr);

        String[] arr2 = new String[N];

        for (int i = 0; i < N; i++) {
            arr2[i] = String.valueOf(arr[i]);
        }

        int max = 0;
        int b = 0; // 코딩 바이오리듬
        int result = 0;

        for (int i = 0; i < N; i++) {
            int y = 0;

            for (int j = 0; j < 4; j++) {
                y += (str.charAt(j) - arr2[i].charAt(j)) * (str.charAt(j) - arr2[i].charAt(j));
            }

            int m = 0;

            for (int j = 4; j < 6; j++) {
                m += (str.charAt(j) - arr2[i].charAt(j)) * (str.charAt(j) - arr2[i].charAt(j));
            }

            int d = 0;

            for (int j = 6; j < 8; j++) {
                d += (str.charAt(j) - arr2[i].charAt(j)) * (str.charAt(j) - arr2[i].charAt(j));
            }

            b = y * m * d;

            if (max < b) {
                max = b;
                result = arr[i];
            }
        }

        System.out.println(result);
        sc.close();
    }
}