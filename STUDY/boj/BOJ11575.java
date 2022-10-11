package boj;
import java.io.*;
import java.util.*;

public class BOJ11575 { // Affine Cipher

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                char ch = (char) ((a * (s.charAt(j) - 'A') + b) % 26 + 'A');

                bw.write(ch);
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}