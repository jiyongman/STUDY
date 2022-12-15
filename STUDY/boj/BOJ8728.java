package boj;
import java.io.*;
import java.util.*;

public class BOJ8728 { // Grusze i jabłonie

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                s = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                e = i;
                break;
            }
        }

        int max = 0;
        max = Math.max(max, e - s);

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                s = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                e = i;
                break;
            }
        }

        max = Math.max(max, e - s);

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}