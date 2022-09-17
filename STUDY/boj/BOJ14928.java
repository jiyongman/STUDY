package boj;
import java.math.BigInteger;
import java.io.*;

public class BOJ14928 { // 큰 수 (BIG)

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N = br.readLine();
        long remain = 0;

        for(int i = 0; i < N.length(); i++) { // 1의 자리부터 올라가며 나머지를 연산하는 방법
            remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
        }

        bw.write(remain + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}