package boj;
import java.io.*;
import java.util.*;

public class BOJ8721 { // Wykreślanka

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // the number of numbers in the sequence John\
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] != num) {
                cnt++;
                continue;
            }
            num++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}