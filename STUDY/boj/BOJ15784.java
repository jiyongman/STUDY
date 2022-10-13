package boj;
import java.io.*;
import java.util.*;

public class BOJ15784 { // 질투진서

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 의자가 놓인 행과 열의 수
        int a = Integer.parseInt(st.nextToken()); // 진서가 앉은 의자가 위치한 행
        int b = Integer.parseInt(st.nextToken()); // 진서가 앉은 의자가 위치한 열
        int[][] X = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                X[i][j] = Integer.parseInt(st2.nextToken()); // 강의실에 앉아있는 학생들의 매력지수
            }
        }

        int max = X[a - 1][b - 1];

        for (int i = 0; i < N; i++) {
            max = Math.max(max, X[i][b - 1]);
            max = Math.max(max, X[a - 1][i]);
        }

        if (max == X[a - 1][b - 1]) {
            bw.write("HAPPY");
        } else {
            bw.write("ANGRY");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}