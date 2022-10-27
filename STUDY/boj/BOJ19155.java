package boj;
import java.io.*;
import java.util.*;

public class BOJ19155 { // Copying Homework

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // the size of Danang’s permutation
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());

            bw.write(String.format("%d ", N - A + 1));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}