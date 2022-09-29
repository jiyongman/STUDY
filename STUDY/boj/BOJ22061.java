package boj;
import java.io.*;
import java.util.*;

public class BOJ22061 { // Покупка велосипеда

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); // the number of tests

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // the number of ruble coins
            int b = Integer.parseInt(st.nextToken()); // the number of two-ruble coins
            int c = Integer.parseInt(st.nextToken()); // the cost of the bike

            if (a + 2 * b >= c) {
                if (a == 0 && c % 2 > 0) {
                    bw.write("NO\n");
                } else {
                    bw.write("YES\n");
                }
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}