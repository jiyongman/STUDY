package boj;
import java.io.*;
import java.util.*;

public class BOJ8678 { // Zbiór

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int z = Integer.parseInt(br.readLine()); // the number of data sets

        for (int i = 0; i < z; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // the numbers from the task body
            int b = Integer.parseInt(st.nextToken()); // the numbers from the task body

            if (b % a == 0) {
                bw.write("TAK\n");
            } else {
                bw.write("NIE\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}