package boj;
import java.util.*;

public class BOJ1931 { // 회의실 배정

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 회의의 수
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt(); // 회의의 시작시간
            arr[i][1] = sc.nextInt(); // 회의의 끝나는 시간
        }

        Arrays.sort(arr, new Comparator<int[]>() { // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { // 끝나는 시간이 같을 경우 시작시간이 빠른 순으로 정렬
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int cnt = 0;
        int end = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= end) { // 종료시간이 다음 회의 시작시간보다 작거나 같다면 갱신
                end = arr[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}