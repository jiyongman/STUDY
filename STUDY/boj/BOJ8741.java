package boj;
import java.io.*;

public class BOJ8741 { // 이진수 합

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            bw.write("1");
        }

        for (int i = 0; i < k - 1; i++) {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}