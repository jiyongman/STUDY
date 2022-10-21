package boj;
import java.io.*;

public class BOJ3778 { // 애너그램 거리

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            String str2 = br.readLine();
            int[] arr = new int[26];
            int[] arr2 = new int[26];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'a']++;
            }

            for (int j = 0; j < str2.length(); j++) {
                arr2[str2.charAt(j) - 'a']++;
            }

            int result = 0;

            for (int j = 0; j < 26; j++) {
                if (arr[j] != arr2[j]) {
                    result += Math.abs(arr[j] - arr2[j]);
                }
            }

            bw.write(String.format("Case #%d: %d\n", i, result));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}