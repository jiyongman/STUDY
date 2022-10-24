package boj;
import java.io.*;
import java.util.*;

public class BOJ25576 { // 찾았다 악질

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 시청자가 구독한 스트리머의 수
        int M = Integer.parseInt(st.nextToken()); // 시청자 변화 추이의 길이
        int[] L = new int[M];
        int[] K = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            L[i] = Integer.parseInt(st2.nextToken());
        }

        int cnt = 0;

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int j = 0; j < M; j++) {
                K[j] = Integer.parseInt(st3.nextToken());

                sum += Math.abs(L[j] - K[j]);
            }

            if (sum > 2000) {
                cnt++;
            }
        }

        if ((N - 1) % 2 > 0) {
            if (cnt >= (N - 1) / 2 + 1) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }
        } else {
            if (cnt >= (N - 1) / 2) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}