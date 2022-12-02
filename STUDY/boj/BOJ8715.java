package boj;
import java.io.*;
import java.util.*;

public class BOJ8715 { // Permutacja

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (arr[i] != i) {
                cnt++;
            }
        }

        if (cnt == 0) {
            bw.write("TAK");
        } else {
            bw.write("NIE");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}