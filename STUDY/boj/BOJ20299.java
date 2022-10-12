package boj;
import java.io.*;
import java.util.*;

public class BOJ20299 { // 3대 측정

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 팀의 수
        int K = Integer.parseInt(st.nextToken()); // 팀원 3명의 레이팅 합에 대한 클럽 가입 조건
        int L = Integer.parseInt(st.nextToken()); // 개인 레이팅에 대한 클럽 가입 조건
        int[] arr = new int[N * 3];
        int cnt = 0;

        for (int i = 0; i < N * 3; i += 3) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st2.nextToken()); // VIP 클럽에 신청한 팀의 팀원들의 레이팅 정보
            int x2 = Integer.parseInt(st2.nextToken()); // VIP 클럽에 신청한 팀의 팀원들의 레이팅 정보
            int x3 = Integer.parseInt(st2.nextToken()); // VIP 클럽에 신청한 팀의 팀원들의 레이팅 정보
            int sum = x1 + x2 + x3;

            if (sum >= K && x1 >= L && x2 >= L && x3 >= L) {
                arr[i] = x1;
                arr[i + 1] = x2;
                arr[i + 2] = x3;
                cnt++;
            }
        }

        System.out.println(cnt);

        for (int i = 0; i < N * 3; i++) {
            if (arr[i] > 0) {
                bw.write(String.format("%d ", arr[i]));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}