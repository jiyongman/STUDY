package codeup;
import java.io.*;

public class CODEUP1084 { // 빛 섞어 색 만들기

    public static void main(String[] args) throws IOException { // Scanner 사용 시 시간 초과

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        int r = Integer.parseInt(arr[0]);
        int g = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);
        int cnt = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}