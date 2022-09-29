package boj;
import java.io.*;
import java.util.*;

public class BOJ20374 { // Big Money

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        double e = 0; // // the total expenses

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, ".");
            int n = Integer.parseInt(st.nextToken()); // the expense e in euros
            int d = Integer.parseInt(st.nextToken()); // the expense e in euros
            e += n * 100 + d;
        }

        bw.write(String.format("%.2f", (e / 100)));
        bw.flush();
        bw.close();
        br.close();
    }
}