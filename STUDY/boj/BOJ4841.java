package boj;
import java.io.*;

public class BOJ4841 { // Look and Say

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); // the number of cases

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            int cnt = 1;

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j - 1) != str.charAt(j)) {
                    sb.append(cnt);
                    sb.append(str.charAt(j - 1));
                    cnt = 1;
                } else {
                    cnt++;
                }
            }

            sb.append(cnt);
            sb.append(str.charAt(str.length() - 1));
            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}