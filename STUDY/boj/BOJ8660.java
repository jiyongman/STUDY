package boj;
import java.io.*;
import java.util.*;

public class BOJ8660 { // Sumy i różnice

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long cnt = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (a < 0) {
                cnt++;
            }
        }

        long result = cnt * (n - 1);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}