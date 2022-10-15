package boj;
import java.io.*;
import java.util.*;

public class BOJ17206 { // 준석이의 수학 숙제

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 문제의 수
        int[] dp = new int[80001];

        for (int j = 1; j <= 80000; j++) {
            dp[j] = dp[j - 1];

            if (j % 3 == 0 || j % 7 == 0) {
                dp[j] += j;
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(dp[N]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}