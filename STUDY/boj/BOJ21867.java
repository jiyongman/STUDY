package boj;
import java.io.*;

public class BOJ21867 { // Java Bitecode

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 코드의 길이
        String S = br.readLine();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) != 'J' && S.charAt(i) != 'A' && S.charAt(i) != 'V') {
                bw.write(String.valueOf(S.charAt(i)));
                cnt++;
            }
        }

        if (cnt == 0) {
            bw.write("nojava");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}