package boj;
import java.io.*;

public class BOJ2154 { // 수 이어 쓰기 3

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(i);
        }

        int result = sb.toString().indexOf(String.valueOf(N)) + 1;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}